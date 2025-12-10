package Visitor;

import Models.*;

public class StatisticsVisitor implements IGameEntityVisitor {
    private int playerCount;
    private int alivePlayerCount;
    private int bombCount;
    private int powerUpCount;
    private int emptyCellCount;
    private int wallCount;
    private int destructibleWallCount;

    public void visitPlayer(Player player) {}
    public void visitBomb(Bomb bomb) {}
    public void visitPowerUp(PowerUp powerUp) {}
    public void visitGameBoard(GameBoard board) {}

    public int getPlayerCount() { return 0; }
    public int getAlivePlayerCount() { return 0; }
    public int getBombCount() { return 0; }
    public int getPowerUpCount() { return 0; }
    public int getEmptyCellCount() { return 0; }
    public int getWallCount() { return 0; }
    public int getDestructibleWallCount() { return 0; }
    public String getStatisticsReport() { return null; }
}

