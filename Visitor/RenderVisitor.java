package Visitor;

import Models.*;
import java.util.List;

public class RenderVisitor implements IGameEntityVisitor {
    private List<String> renderOutput;

    public void visitPlayer(Player player) {}
    public void visitBomb(Bomb bomb) {}
    public void visitPowerUp(PowerUp powerUp) {}
    public void visitGameBoard(GameBoard board) {}

    public List<String> getRenderOutput() { return null; }
    public void clear() {}
}

