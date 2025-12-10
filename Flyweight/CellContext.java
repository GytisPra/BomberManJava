package Flyweight;

import Enums.CellType;

public class CellContext {
    private int x;
    private int y;
    private CellFlyweight flyweight;

    public CellContext(int x, int y, CellType type) {}

    public int getX() { return 0; }
    public int getY() { return 0; }
    public CellFlyweight getFlyweight() { return null; }
    public void render() {}
}

