package Visitor;

import Models.*;

public interface IGameEntityVisitor {
    void visitPlayer(Player player);
    void visitBomb(Bomb bomb);
    void visitPowerUp(PowerUp powerUp);
    void visitGameBoard(GameBoard board);
}

