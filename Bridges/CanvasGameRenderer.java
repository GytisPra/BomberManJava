package Bridges;

import Models.*;

public class CanvasGameRenderer implements IGameRenderer {

    @Override
    public String renderPlayer(Player player) {
        return String.format(
            "{\"id\":\"%s\",\"name\":\"%s\",\"x\":%d,\"y\":%d,\"isAlive\":%s,\"color\":\"%s\"}",
            escape(player.getId()),
            escape(player.getName()),
            player.getX(),
            player.getY(),
            player.isAlive(),
            escape(player.getColor())
        );
    }

    @Override
    public String renderBomb(Bomb bomb) {
        return String.format(
            "{\"id\":\"%s\",\"x\":%d,\"y\":%d,\"playerId\":\"%s\",\"range\":%d}",
            escape(bomb.getId()),
            bomb.getX(),
            bomb.getY(),
            escape(bomb.getPlayerId()),
            bomb.getRange()
        );
    }

    @Override
    public String renderExplosion(Explosion explosion) {
        return String.format(
            "{\"x\":%d,\"y\":%d}",
            explosion.getX(),
            explosion.getY()
        );
    }

    @Override
    public String renderPowerUp(PowerUp powerUp) {
        return String.format(
            "{\"x\":%d,\"y\":%d,\"type\":\"%s\"}",
            powerUp.getX(),
            powerUp.getY(),
            escape(powerUp.getType().toString())
        );
    }

    @Override
    public String renderGameBoard(GameBoard board) {
        return String.format(
            "{\"grid\":%s,\"bombs\":%s,\"explosions\":%s,\"powerUps\":%s,\"width\":%d,\"height\":%d}",
            toJsonArray(board.getGrid()),
            toJsonArray(board.getBombs()),
            toJsonArray(board.getExplosions()),
            toJsonArray(board.getPowerUps()),
            GameBoard.Width,
            GameBoard.Height
        );
    }

    // --- Helper methods ---

    private String escape(String text) {
        if (text == null) return "";
        return text.replace("\"", "\\\""); // escape quotes
    }

    private String toJsonArray(Object obj) {
        // Simple fallback — you can expand this based on actual structure
        if (obj == null) return "[]";
        return "\"" + escape(obj.toString()) + "\""; // Just to avoid nulls / recursion
    }
}
