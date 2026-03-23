B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Центральное состояние playback director.
' Это основной operational source of truth для active / prepared / pending слотов.

Sub Class_Globals
	Public Slots As List
	Public IsTickInProgress As Boolean
	Public DecisionEpoch As Long
	Public CurrentDecision As String
	Public FlowState As String
End Sub

Public Sub Initialize
	Reset
End Sub

Public Sub Reset
	Slots.Initialize
	IsTickInProgress = False
	DecisionEpoch = 0
	CurrentDecision = ""
	FlowState = "idle"
End Sub

' Создает стандартный набор слотов для двух аудиоплееров и одного резервного interrupt-слота.
Public Sub ConfigureDefaultSlots
	If Slots.IsInitialized = False Then Slots.Initialize
	If Slots.Size > 0 Then Return
	Slots.Add(CreateSlot("slot_primary", "primary"))
	Slots.Add(CreateSlot("slot_secondary", "secondary"))
	Slots.Add(CreateSlot("slot_interrupt", ""))
End Sub

' Compatibility bridge: нужен только для legacy/fallback путей, когда надо собрать director из старого runtimeState.
Public Sub ApplyLegacyRuntime(runtimeState As PlaybackRuntimeState)
	ConfigureDefaultSlots
	For Each slot As PlaybackPlayerSlot In Slots
		slot.Reset
	Next
	If runtimeState.ActiveAudioKey <> "" Then
		Dim activeSlot As PlaybackPlayerSlot = GetSlotByAudioKey(runtimeState.ActiveAudioKey)
		If activeSlot.IsInitialized Then
			activeSlot.SetRoleState("active", "playing")
			activeSlot.SetItem(runtimeState.ActiveItem)
		End If
	End If
	If runtimeState.PendingPlayAudioKey <> "" Then
		Dim pendingPlaySlot As PlaybackPlayerSlot = GetSlotByAudioKey(runtimeState.PendingPlayAudioKey)
		If pendingPlaySlot.IsInitialized Then
			pendingPlaySlot.SetRoleState("pending_play", "loading")
			pendingPlaySlot.SetItem(runtimeState.PendingPlayItem)
		End If
	End If
	If runtimeState.PreparedAudioKey <> "" Then
		Dim preparedSlot As PlaybackPlayerSlot = GetSlotByAudioKey(runtimeState.PreparedAudioKey)
		If preparedSlot.IsInitialized Then
			preparedSlot.SetRoleState(ResolvePreparedRole(runtimeState.PreparedItem), "ready")
			preparedSlot.SetItem(runtimeState.PreparedItem)
		End If
	End If
	If runtimeState.PendingPrepareAudioKey <> "" Then
		Dim pendingPrepareSlot As PlaybackPlayerSlot = GetSlotByAudioKey(runtimeState.PendingPrepareAudioKey)
		If pendingPrepareSlot.IsInitialized Then
			pendingPrepareSlot.SetRoleState(ResolvePendingPrepareRole(runtimeState.PendingPrepareItem), "loading")
			pendingPrepareSlot.SetItem(runtimeState.PendingPrepareItem)
		End If
	End If
End Sub

Public Sub GetSlotByAudioKey(audioKey As String) As PlaybackPlayerSlot
	For Each slot As PlaybackPlayerSlot In Slots
		If slot.AudioKey = audioKey Then Return slot
	Next
	Dim emptySlot As PlaybackPlayerSlot
	Return emptySlot
End Sub

Public Sub GetSlotByRole(roleValue As String) As PlaybackPlayerSlot
	For Each slot As PlaybackPlayerSlot In Slots
		If slot.Role = roleValue Then Return slot
	Next
	Dim emptySlot As PlaybackPlayerSlot
	Return emptySlot
End Sub

Public Sub GetActiveSlot As PlaybackPlayerSlot
	Return GetSlotByRole("active")
End Sub

' Возвращает prepared slot с приоритетом music -> interrupt -> generic.
Public Sub GetPreparedSlot As PlaybackPlayerSlot
	Dim preparedMusicSlot As PlaybackPlayerSlot = GetSlotByRole("prepared_music")
	If preparedMusicSlot.IsInitialized Then Return preparedMusicSlot
	Dim preparedInterruptSlot As PlaybackPlayerSlot = GetSlotByRole("prepared_interrupt")
	If preparedInterruptSlot.IsInitialized Then Return preparedInterruptSlot
	Dim preparedSlot As PlaybackPlayerSlot = GetSlotByRole("prepared")
	If preparedSlot.IsInitialized Then Return preparedSlot
	Dim emptySlot As PlaybackPlayerSlot
	Return emptySlot
End Sub

Public Sub GetPendingPlaySlot As PlaybackPlayerSlot
	Return GetSlotByRole("pending_play")
End Sub

' Возвращает pending prepare slot с приоритетом music -> interrupt -> generic.
Public Sub GetPendingPrepareSlot As PlaybackPlayerSlot
	Dim pendingPrepareMusicSlot As PlaybackPlayerSlot = GetSlotByRole("pending_prepare_music")
	If pendingPrepareMusicSlot.IsInitialized Then Return pendingPrepareMusicSlot
	Dim pendingInterruptSlot As PlaybackPlayerSlot = GetSlotByRole("pending_interrupt")
	If pendingInterruptSlot.IsInitialized Then Return pendingInterruptSlot
	Dim pendingPrepareSlot As PlaybackPlayerSlot = GetSlotByRole("pending_prepare")
	If pendingPrepareSlot.IsInitialized Then Return pendingPrepareSlot
	Dim emptySlot As PlaybackPlayerSlot
	Return emptySlot
End Sub

Public Sub HasPreparedSlot As Boolean
	Dim preparedSlot As PlaybackPlayerSlot = GetPreparedSlot
	Return preparedSlot.IsInitialized And preparedSlot.HasItem
End Sub

Public Sub ClearSlotByAudioKey(audioKey As String)
	Dim slot As PlaybackPlayerSlot = GetSlotByAudioKey(audioKey)
	If slot.IsInitialized Then slot.Reset
End Sub

Public Sub ClearRole(roleValue As String)
	Dim slot As PlaybackPlayerSlot = GetSlotByRole(roleValue)
	If slot.IsInitialized Then slot.Reset
End Sub

' Регистрирует, что по audioKey ожидается обычный старт воспроизведения.
Public Sub SetPendingPlay(audioKey As String, item As Map)
	ClearSlotByAudioKey(audioKey)
	Dim slot As PlaybackPlayerSlot = GetSlotByAudioKey(audioKey)
	If slot.IsInitialized Then
		slot.SetRoleState("pending_play", "loading")
		slot.SetItem(item)
	End If
End Sub

' Регистрирует preload: слот еще не играет, но мы ждём ready для будущего prepared item.
Public Sub SetPendingPrepare(audioKey As String, item As Map)
	ClearSlotByAudioKey(audioKey)
	ClearRole("pending_prepare_music")
	ClearRole("pending_interrupt")
	ClearRole("pending_prepare")
	Dim slot As PlaybackPlayerSlot = GetSlotByAudioKey(audioKey)
	If slot.IsInitialized Then
		slot.SetRoleState(ResolvePendingPrepareRole(item), "loading")
		slot.SetItem(item)
	End If
End Sub

' Фиксирует единственный prepared slot и очищает предыдущие prepared-роли.
Public Sub SetPrepared(audioKey As String, item As Map)
	ClearSlotByAudioKey(audioKey)
	ClearRole("prepared_music")
	ClearRole("prepared_interrupt")
	ClearRole("prepared")
	Dim slot As PlaybackPlayerSlot = GetSlotByAudioKey(audioKey)
	If slot.IsInitialized Then
		slot.SetRoleState(ResolvePreparedRole(item), "ready")
		slot.SetItem(item)
	End If
End Sub

' Делает слот единственным active playback-слотом и сбрасывает предыдущий active.
Public Sub SetActive(audioKey As String, item As Map)
	Dim currentActiveSlot As PlaybackPlayerSlot = GetActiveSlot
	If currentActiveSlot.IsInitialized And currentActiveSlot.AudioKey <> audioKey Then currentActiveSlot.Reset
	ClearSlotByAudioKey(audioKey)
	Dim slot As PlaybackPlayerSlot = GetSlotByAudioKey(audioKey)
	If slot.IsInitialized Then
		slot.SetRoleState("active", "playing")
		slot.SetItem(item)
		slot.MarkProgress
	End If
End Sub

Public Sub DescribeSlots As String
	Dim parts As List
	parts.Initialize
	For Each slot As PlaybackPlayerSlot In Slots
		Dim itemId As String = ""
		If slot.HasItem Then itemId = slot.Item.GetDefault("id", "")
		parts.Add(slot.SlotId & ":" & slot.Role & ":" & slot.State & ":" & itemId)
	Next
	Return JoinParts(parts)
End Sub

Public Sub BeginDecision(decisionName As String)
	DecisionEpoch = DecisionEpoch + 1
	CurrentDecision = decisionName
End Sub

' Защита от повторного запуска того же transition-path поверх уже идущего decision.
Public Sub TryBeginDecision(decisionName As String) As Boolean
	If CurrentDecision <> "" Then Return False
	BeginDecision(decisionName)
	Return True
End Sub

Public Sub ClearDecision
	CurrentDecision = ""
End Sub

Public Sub SetFlowState(stateValue As String)
	If stateValue = "" Then stateValue = "idle"
	FlowState = stateValue
End Sub

Public Sub IsTransitionInProgress As Boolean
	Return FlowState = "starting" Or FlowState = "transitioning" Or FlowState = "stopping"
End Sub

Public Sub IsFlowActive As Boolean
	Return FlowState = "playing" Or FlowState = "preparing" Or FlowState = "transitioning" Or FlowState = "starting"
End Sub

' Разделяет prepared music и prepared interrupt, чтобы реклама и музыка не конкурировали за один слот.
Private Sub ResolvePreparedRole(item As Map) As String
	If item.IsInitialized = False Then Return "prepared"
	If item.GetDefault("type", "") = "ad" Then Return "prepared_interrupt"
	Return "prepared_music"
End Sub

Private Sub ResolvePendingPrepareRole(item As Map) As String
	If item.IsInitialized = False Then Return "pending_prepare"
	If item.GetDefault("type", "") = "ad" Then Return "pending_interrupt"
	Return "pending_prepare_music"
End Sub

Private Sub CreateSlot(slotIdValue As String, audioKeyValue As String) As PlaybackPlayerSlot
	Dim slot As PlaybackPlayerSlot
	slot.Initialize(slotIdValue, audioKeyValue)
	Return slot
End Sub

Private Sub JoinParts(parts As List) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To parts.Size - 1
		If i > 0 Then sb.Append(" | ")
		sb.Append(parts.Get(i))
	Next
	Return sb.ToString
End Sub
