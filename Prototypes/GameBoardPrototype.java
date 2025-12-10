package Prototypes;

import Models.GameBoard;

public class GameBoardPrototype implements IPrototype<GameBoard> {
    private GameBoard template;

    public GameBoardPrototype(GameBoard template) {}

    public GameBoard clone() { return null; }
    public GameBoard cloneShallow() { return null; }
}
