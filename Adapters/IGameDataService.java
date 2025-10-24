package Adapters;

import java.util.concurrent.CompletableFuture;

public interface IGameDataService
{
    CompletableFuture<GameRoomData> getGameDataAsync(String roomId);
    CompletableFuture<Boolean> saveGameDataAsync(String roomId, GameRoomData data);
}
