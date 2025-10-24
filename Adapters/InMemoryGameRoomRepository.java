package Adapters;

import java.util.concurrent.*;
import java.util.concurrent.ConcurrentHashMap;

import Models.GameRoom;

public class InMemoryGameRoomRepository implements IGameRoomRepository {
    private final ConcurrentHashMap<String, GameRoom> rooms = new ConcurrentHashMap<>();

    @Override
    public CompletableFuture<GameRoom> getRoomAsync(String roomId) {
        return CompletableFuture.supplyAsync(() -> rooms.get(roomId));
    }

    @Override
    public CompletableFuture<Void> saveRoomAsync(GameRoom room) {
        return CompletableFuture.runAsync(() -> rooms.put(room.getId(), room));
    }
}
