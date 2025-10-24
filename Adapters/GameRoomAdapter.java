package Adapters;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import Models.*;
import Enums.GameState;

public class GameRoomAdapter implements IGameDataService {
    private final IGameRoomRepository repository;

    public GameRoomAdapter(IGameRoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompletableFuture<GameRoomData> getGameDataAsync(String roomId) {
        return repository.getRoomAsync(roomId).thenApply(room -> {
            if (room == null) {
                return new GameRoomData();
            }

            GameRoomData data = new GameRoomData();
            data.setRoomId(room.getId());
            data.setState(room.getState().toString());
            data.setLastUpdate(room.getLastUpdate());
            data.setPlayers(
                room.getPlayers().stream().map(p -> {
                    PlayerData pd = new PlayerData();
                    pd.setId(p.getId());
                    pd.setName(p.getName());
                    pd.setX(p.getX());
                    pd.setY(p.getY());
                    pd.setAlive(p.isAlive());
                    return pd;
                }).collect(Collectors.toList())
            );

            return data;
        });
    }

    @Override
    public CompletableFuture<Boolean> saveGameDataAsync(String roomId, GameRoomData data) {
        return CompletableFuture.supplyAsync(() -> {
            GameRoom room = new GameRoom();
            room.setId(data.getRoomId());
            room.setState(GameState.valueOf(data.getState()));
            room.setLastUpdate(data.getLastUpdate());
            room.setPlayers(
                data.getPlayers().stream().map(p -> {
                    Player player = new Player();
                    player.setId(p.getId());
                    player.setName(p.getName());
                    player.setX(p.getX());
                    player.setY(p.getY());
                    player.setAlive(p.isAlive());
                    return player;
                }).collect(Collectors.toList())
            );

            repository.saveRoomAsync(room);
            return true;
        });
    }
}
