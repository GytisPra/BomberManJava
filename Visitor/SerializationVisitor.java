package Visitor;

import Models.*;

public class SerializationVisitor implements IGameEntityVisitor {
    private StringBuilder jsonBuilder;

    public void visitPlayer(Player player) {}
    public void visitBomb(Bomb bomb) {}
    public void visitPowerUp(PowerUp powerUp) {}
    public void visitGameBoard(GameBoard board) {}

    public String getJson() { return null; }
    public void clear() {}
}

