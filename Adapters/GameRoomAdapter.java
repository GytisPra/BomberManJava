package Adapters;

import java.util.concurrent.CompletableFuture;

public class GameRoomAdapter implements IGameDataService {
    private IGameRoomRepository repository;

    public GameRoomAdapter(IGameRoomRepository repository) {}

    public CompletableFuture<Void> saveGameRoomAsync(GameRoomData roomData) { return null; }
    public CompletableFuture<GameRoomData> getGameRoomAsync(String roomId) { return null; }
}
