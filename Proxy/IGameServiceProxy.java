package Proxy;

import Models.GameRoom;
import Models.Player;
import java.util.concurrent.CompletableFuture;

public interface IGameServiceProxy {
    GameRoom getRoom(String roomId);
    CompletableFuture<Boolean> joinRoomAsync(String roomId, Player player);
    CompletableFuture<Boolean> placeBombAsync(String roomId, String playerId);
}

