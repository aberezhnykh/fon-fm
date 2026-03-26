# Module Revision

## Common
These modules are now stored in `player/Common` and are intended to be connected to both B4J and B4A by relative path:

- `AdScheduler.bas`
- `AutonomousCacheManager.bas`
- `DataPlaybackResolver.bas`
- `MediaCache.bas`
- `NetworkSyncService.bas`
- `OfflinePlaybackEngine.bas`
- `OfflineStore.bas`
- `PlaybackDataCoordinator.bas`
- `PlaybackDataPolicyState.bas`
- `PlaybackDirectorState.bas`
- `PlaybackMetaState.bas`
- `PlaybackOrchestrationState.bas`
- `PlaybackPlayerSlot.bas`
- `PlaybackRuntimeState.bas`
- `PlaybackTraceFormatter.bas`
- `PlaybackTraceRouter.bas`
- `PlaybackTraceUploader.bas`
- `PlaybackTransitionCoordinator.bas`
- `PlayerStateStore.bas`
- `TraceService.bas`
- `PlatformBridge.bas`
- `B4XMainPage.bas`

## Platform
These modules remain platform-specific in the current revision:

- `player/B4J/AudioPlayer.bas`
- `player/B4J/PlayerUiController.bas`
- `player/B4J/UiStyle.bas`
- `player/B4A/AudioPlayer.bas`
- `player/B4A/PlayerUiController.bas`
- `player/B4A/Starter.bas`

`player/Common/B4XMainPage.bas` is still mixed.
It is shared as an entry point, but it still contains B4J-specific UI and desktop lifecycle code and should be cleaned further before a full B4A connection.

## Legacy
These modules are not connected to the active project graph and were moved out of the working B4J folder:

- `player/Legacy/CachePrefetchManager.bas`
- `player/Legacy/CacheQueuePredictor.bas`

Before reusing them, review whether they should return to `Common` or be removed permanently.
