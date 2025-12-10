package Adapters;

import java.util.concurrent.CompletableFuture;

public interface IGameDataService {
    CompletableFuture<Void> saveGameRoomAsync(GameRoomData roomData);
    CompletableFuture<GameRoomData> getGameRoomAsync(String roomId);
}
