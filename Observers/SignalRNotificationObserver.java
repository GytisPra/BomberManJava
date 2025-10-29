package Observers;

import Events.*;
import Hubs.GameHub;

public class SignalRNotificationObserver implements IGameObserver {
    @SuppressWarnings("unused")
    private final IHubContext<GameHub> hubContext;

    public SignalRNotificationObserver(IHubContext<GameHub> hubContext) {
        this.hubContext = hubContext;
    }

    @Override
    public void onGameEvent(IGameEvent gameEvent) {
        // Send notifications to connected clients via SignalR
    }
}
