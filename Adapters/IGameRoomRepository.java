package Adapters;

import java.util.concurrent.CompletableFuture;
import Models.GameRoom;

public interface IGameRoomRepository {
    CompletableFuture<GameRoom> getRoomAsync(String roomId);
    CompletableFuture<Void> saveRoomAsync(GameRoom room);
}
