package Models;

import java.util.*;
import Enums.CellType;

public class GameBoard {
    public static final int Width = 15;
    public static final int Height = 13;

    private int[][] grid = new int[Height][Width];
    private List<Bomb> bombs = new ArrayList<>();
    private List<Explosion> explosions = new ArrayList<>();
    private List<PowerUp> powerUps = new ArrayList<>();

    public GameBoard() {
        initializeBoard();
    }

    private void initializeBoard() {
        Random rnd = new Random();

        for (int y = 0; y < Height; y++) {
            for (int x = 0; x < Width; x++) {

                if (x == 0 || x == Width - 1 || y == 0 || y == Height - 1) {
                    grid[y][x] = CellType.Wall.ordinal();
                } else if (x % 2 == 0 && y % 2 == 0) {
                    grid[y][x] = CellType.Wall.ordinal();
                } else if ((x == 1 && y == 1) || (x == 1 && y == 2) || (x == 2 && y == 1)
                        || (x == Width - 2 && y == 1) || (x == Width - 2 && y == 2) || (x == Width - 3 && y == 1)
                        || (x == 1 && y == Height - 2) || (x == 1 && y == Height - 3) || (x == 2 && y == Height - 2)
                        || (x == Width - 2 && y == Height - 2) || (x == Width - 2 && y == Height - 3)
                        || (x == Width - 3 && y == Height - 2)) {
                    grid[y][x] = CellType.Empty.ordinal();
                } else if (rnd.nextDouble() < 0.6) {
                    grid[y][x] = CellType.DestructibleWall.ordinal();
                } else {
                    grid[y][x] = CellType.Empty.ordinal();
                }
            }
        }
    }

    public CellType getCellType(int x, int y) {
        if (x < 0 || x >= Width || y < 0 || y >= Height)
            return CellType.Wall;

        return CellType.values()[grid[y][x]];
    }

    public void setCellType(int x, int y, CellType cellType) {
        if (x >= 0 && x < Width && y >= 0 && y < Height) {
            grid[y][x] = cellType.ordinal();
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public List<Explosion> getExplosions() {
        return explosions;
    }

    public List<PowerUp> getPowerUps() {
        return powerUps;
    }
}
