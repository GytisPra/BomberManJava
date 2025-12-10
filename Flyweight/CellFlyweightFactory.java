package Flyweight;

import Enums.CellType;
import java.util.Map;

public class CellFlyweightFactory {
    private static Map<CellType, CellFlyweight> flyweights;

    public static CellFlyweight getFlyweight(CellType type) { return null; }
    private static CellFlyweight createFlyweight(CellType type) { return null; }
    public static int getFlyweightCount() { return 0; }
}

