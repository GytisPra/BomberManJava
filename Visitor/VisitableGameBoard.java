package Visitor;

import Models.GameBoard;

public class VisitableGameBoard implements IVisitableEntity {
    private GameBoard board;

    public VisitableGameBoard(GameBoard board) {}

    public GameBoard getBoard() { return null; }
    public void accept(IGameEntityVisitor visitor) {}
}

