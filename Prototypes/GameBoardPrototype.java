package Prototypes;

import Models.*;
import java.util.ArrayList;
import java.util.List;

public class GameBoardPrototype implements IPrototype<GameBoard> {

    private final GameBoard template;

    public GameBoardPrototype(GameBoard template) {
        this.template = template;
    }

    // -----------------------
    // Deep clone
    // -----------------------
    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();

        // Copy grid
        for (int y = 0; y < GameBoard.Height; y++) {
            System.arraycopy(template.getGrid()[y], 0, newBoard.getGrid()[y], 0, GameBoard.Width);
        }

        // Clone bombs
        List<Bomb> newBombs = new ArrayList<>();
        for (Bomb b : template.getBombs()) {
            newBombs.add(b.clone());
        }
        newBoard.getBombs().clear();
        newBoard.getBombs().addAll(newBombs);

        // Clone explosions
        List<Explosion> newExplosions = new ArrayList<>();
        for (Explosion e : template.getExplosions()) {
            newExplosions.add(e.clone());
        }
        newBoard.getExplosions().clear();
        newBoard.getExplosions().addAll(newExplosions);

        // Clone power-ups
        List<PowerUp> newPowerUps = new ArrayList<>();
        for (PowerUp p : template.getPowerUps()) {
            newPowerUps.add(p.clone());
        }
        newBoard.getPowerUps().clear();
        newBoard.getPowerUps().addAll(newPowerUps);

        return newBoard;
    }

    // -----------------------
    // Shallow clone
    // -----------------------
    @Override
    public GameBoard cloneShallow() {
        GameBoard newBoard = new GameBoard();

        newBoard.setGrid(template.getGrid());
        newBoard.getBombs().clear();
        newBoard.getBombs().addAll(template.getBombs());
        newBoard.getExplosions().clear();
        newBoard.getExplosions().addAll(template.getExplosions());
        newBoard.getPowerUps().clear();
        newBoard.getPowerUps().addAll(template.getPowerUps());

        return newBoard;
    }
}
