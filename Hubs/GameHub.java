package Hubs;

import Services.IGameService;
import Singletons.GameLogger;
import Models.*;
import Bridges.*;

import java.util.*;

public class GameHub {

    private final IGameService gameService;
    private final GameLogger logger = GameLogger.getInstance();

    public GameHub(IGameService gameService) {
        this.gameService = gameService;
    }

    public void joinRoom(String roomId, String playerName) {
        // Placeholder: Replace SignalR logic with equivalent Java networking if needed
    }

    public void rolePreviews() {
        // Placeholder for SignalR Client send logic
    }

    public void changeBombFactory(String roomId, String factoryType) {
        // Placeholder
    }

    public void changeTheme(String roomId, String theme) {
        // Placeholder
    }

    public void onConnected() {
        // Equivalent to OnConnectedAsync
    }

    public void onDisconnected(Exception exception) {
        // Equivalent to OnDisconnectedAsync
    }

    public void startGame(String roomId) {
        // Placeholder
    }

    public void movePlayer(String roomId, int deltaX, int deltaY) {
        // Placeholder for move command handling
    }

    public void placeBomb(String roomId) {
        // Placeholder for bomb command handling
    }

    public void getRoomStatus(String roomId) {
        // Placeholder for room status retrieval
    }

    public void changeRenderer(String roomId, String rendererType) {
        // Placeholder for renderer switching
    }

    private Object createRoomResponse(String roomId, GameRoom room) {
        // Simulate what C# anonymous types do with a Java map
        Map<String, Object> response = new HashMap<>();

        IGameRenderer renderer = gameService.getRoomRenderer(roomId);
        String theme = gameService.getRoomTheme(roomId);
        String bombFactoryType = gameService.getRoomBombFactoryType(roomId);

        List<Map<String, Object>> playersList = new ArrayList<>();
        if (room.getPlayers() != null) {
            for (Player p : room.getPlayers()) {
                Map<String, Object> playerMap = new HashMap<>();
                playerMap.put("id", p.getId());
                playerMap.put("name", p.getName());
                playerMap.put("x", p.getX());
                playerMap.put("y", p.getY());
                playerMap.put("isAlive", p.isAlive());
                playerMap.put("bombCount", p.getBombCount());
                playerMap.put("bombRange", p.getBombRange());
                playerMap.put("color", p.getColor());
                playerMap.put("speed", p.getSpeed());
                playersList.add(playerMap);
            }
        }

        Map<String, Object> boardData = new HashMap<>();
        if (room.getBoard() != null) {
            boardData.put("grid", room.getBoard().getGrid());

            List<Map<String, Object>> bombs = new ArrayList<>();
            if (room.getBoard().getBombs() != null) {
                for (Bomb b : room.getBoard().getBombs()) {
                    Map<String, Object> bombMap = new HashMap<>();
                    bombMap.put("x", b.getX());
                    bombMap.put("y", b.getY());
                    bombMap.put("playerId", b.getPlayerId());
                    bombMap.put("range", b.getRange());
                    bombMap.put("placedAt", b.getPlacedAt());
                    bombs.add(bombMap);
                }
            }

            List<Map<String, Object>> explosions = new ArrayList<>();
            if (room.getBoard().getExplosions() != null) {
                for (Explosion e : room.getBoard().getExplosions()) {
                    Map<String, Object> explosionMap = new HashMap<>();
                    explosionMap.put("x", e.getX());
                    explosionMap.put("y", e.getY());
                    explosionMap.put("createdAt", e.getCreatedAt());
                    explosions.add(explosionMap);
                }
            }

            List<Map<String, Object>> powerUps = new ArrayList<>();
            if (room.getBoard().getPowerUps() != null) {
                for (PowerUp p : room.getBoard().getPowerUps()) {
                    Map<String, Object> powerMap = new HashMap<>();
                    powerMap.put("x", p.getX());
                    powerMap.put("y", p.getY());
                    powerMap.put("type", p.getType().toString());
                    powerUps.add(powerMap);
                }
            }

            boardData.put("bombs", bombs);
            boardData.put("explosions", explosions);
            boardData.put("powerUps", powerUps);
        }

        response.put("id", room.getId());
        response.put("players", playersList);
        response.put("board", boardData);
        response.put("state", room.getState().toString());
        response.put("rendererType", renderer != null ? renderer.getClass().getSimpleName() : "json");
        response.put("theme", theme);
        response.put("bombFactory", bombFactoryType);

        return response;
    }
}
