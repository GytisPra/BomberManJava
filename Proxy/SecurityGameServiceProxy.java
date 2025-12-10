package Proxy;

import Models.GameRoom;
import Models.Player;
import Services.IGameService;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class SecurityGameServiceProxy implements IGameServiceProxy {
    private IGameService realService;
    private Set<String> authorizedPlayers;

    public SecurityGameServiceProxy(IGameService realService) {}

    public void authorizePlayer(String playerId) {}
    public void revokeAuthorization(String playerId) {}
    public GameRoom getRoom(String roomId) { return null; }
    public CompletableFuture<Boolean> joinRoomAsync(String roomId, Player player) { return null; }
    public CompletableFuture<Boolean> placeBombAsync(String roomId, String playerId) { return null; }
}

