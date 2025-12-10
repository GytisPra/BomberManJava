package Models;

import java.util.List;
import Enums.CellType;

public class GameBoard {
    public static final int Width = 15;
    public static final int Height = 13;

    private int[][] grid;
    private List<Bomb> bombs;
    private List<Explosion> explosions;
    private List<PowerUp> powerUps;

    public GameBoard() {}

    private void initializeBoard() {}
    public CellType getCellType(int x, int y) { return null; }
    public void setCellType(int x, int y, CellType cellType) {}
    public int[][] getGrid() { return null; }
    public void setGrid(int[][] newGrid) {}
    public List<Bomb> getBombs() { return null; }
    public List<Explosion> getExplosions() { return null; }
    public List<PowerUp> getPowerUps() { return null; }
}
