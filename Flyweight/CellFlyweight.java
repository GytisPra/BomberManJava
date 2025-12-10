package Flyweight;

import Enums.CellType;

public class CellFlyweight {
    private CellType type;
    private String symbol;
    private boolean isWalkable;
    private boolean isDestructible;

    public CellFlyweight(CellType type, String symbol, boolean isWalkable, boolean isDestructible) {}

    public CellType getType() { return null; }
    public String getSymbol() { return null; }
    public boolean isWalkable() { return false; }
    public boolean isDestructible() { return false; }
}

