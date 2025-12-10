package Composite;

public class GameAreaComposite extends GameEntityComposite {
    private String areaType;

    public GameAreaComposite(String name, int x, int y, String areaType) { super(name, x, y); }

    public String getAreaType() { return null; }
    public void render() {}
    public int countEntities() { return 0; }
    private int countEntitiesRecursive(GameEntityComposite composite) { return 0; }
}

