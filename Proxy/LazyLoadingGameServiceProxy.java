package Proxy;

import Models.GameRoom;
import Models.Player;
import Services.IGameService;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class LazyLoadingGameServiceProxy implements IGameServiceProxy {
    private Supplier<IGameService> serviceFactory;
    private IGameService realService;
    private boolean isInitialized;

    public LazyLoadingGameServiceProxy(Supplier<IGameService> serviceFactory) {}

    private IGameService getService() { return null; }
    public GameRoom getRoom(String roomId) { return null; }
    public CompletableFuture<Boolean> joinRoomAsync(String roomId, Player player) { return null; }
    public CompletableFuture<Boolean> placeBombAsync(String roomId, String playerId) { return null; }
    public void reset() {}
}

