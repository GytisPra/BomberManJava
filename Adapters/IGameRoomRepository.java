package Adapters;

import java.util.concurrent.CompletableFuture;

public interface IGameRoomRepository {
    CompletableFuture<Void> saveAsync(GameRoomData roomData);
    CompletableFuture<GameRoomData> findByIdAsync(String roomId);
}
