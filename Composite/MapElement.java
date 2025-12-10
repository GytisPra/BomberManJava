package Composite;

import Enums.CellType;

/**
 * Composite Pattern - Leaf class representing a single map element
 * Leaf components do not have child management methods
 * This follows Refactoring.Guru Composite pattern: only Composite has Add/Remove/GetChild
 */
public class MapElement implements IGameEntity {
    private String name;
    private int x;
    private int y;
    private CellType type;
    private boolean visible;
    private boolean safe;

    public MapElement(String name, int x, int y, CellType type) {}

    public String getName() { return null; }
    public int getX() { return 0; }
    public int getY() { return 0; }
    public CellType getType() { return null; }
    public void render() {}
    public boolean isVisible() { return false; }
    public boolean isSafe() { return false; }
}

