package Visitor;

import Models.*;
import java.util.List;

public class ValidationVisitor implements IGameEntityVisitor {
    private List<String> validationErrors;
    private List<String> validationWarnings;

    public void visitPlayer(Player player) {}
    public void visitBomb(Bomb bomb) {}
    public void visitPowerUp(PowerUp powerUp) {}
    public void visitGameBoard(GameBoard board) {}

    public boolean isValid() { return false; }
    public List<String> getErrors() { return null; }
    public List<String> getWarnings() { return null; }
    public String getValidationReport() { return null; }
}

