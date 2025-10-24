package Bridges;

import Models.*;

public class JsonGameRenderer implements IGameRenderer {

    private static String esc(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    @Override
    public String renderPlayer(Player player) {
        return "{"
                + "\"id\":\"" + esc(player.getId()) + "\","
                + "\"name\":\"" + esc(player.getName()) + "\","
                + "\"x\":" + player.getX() + ","
                + "\"y\":" + player.getY() + ","
                + "\"isAlive\":" + player.isAlive() + ","
                + "\"color\":\"" + esc(player.getColor()) + "\""
                + "}";
    }

    @Override
    public String renderBomb(Bomb bomb) {
        return "{"
                + "\"id\":\"" + esc(bomb.getId()) + "\","
                + "\"x\":" + bomb.getX() + ","
                + "\"y\":" + bomb.getY() + ","
                + "\"playerId\":\"" + esc(bomb.getPlayerId()) + "\","
                + "\"range\":" + bomb.getRange()
                + "}";
    }

    @Override
    public String renderExplosion(Explosion explosion) {
        return "{"
                + "\"x\":" + explosion.getX() + ","
                + "\"y\":" + explosion.getY()
                + "}";
    }

    @Override
    public String renderPowerUp(PowerUp powerUp) {
        return "{"
                + "\"x\":" + powerUp.getX() + ","
                + "\"y\":" + powerUp.getY() + ","
                + "\"type\":\"" + esc(powerUp.getType().toString()) + "\""
                + "}";
    }

    @Override
    public String renderGameBoard(GameBoard board) {
        Object grid = board.getGrid();
        String gridStr = (grid == null) ? "null" : "\"" + esc(grid.toString()) + "\"";
        return "{"
                + "\"grid\":" + gridStr + ","
                + "\"bombs\":" + board.getBombs().size() + ","
                + "\"explosions\":" + board.getExplosions().size() + ","
                + "\"powerUps\":" + board.getPowerUps().size()
                + "}";
    }
}