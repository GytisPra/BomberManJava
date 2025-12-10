package Adapters;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class InMemoryGameRoomRepository implements IGameRoomRepository {
    private Map<String, GameRoomData> storage;

    public CompletableFuture<Void> saveAsync(GameRoomData roomData) { return null; }
    public CompletableFuture<GameRoomData> findByIdAsync(String roomId) { return null; }
}
