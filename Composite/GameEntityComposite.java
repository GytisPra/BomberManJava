package Composite;

import java.util.List;

/**
 * Composite Pattern - Composite class that can contain other entities
 * According to Refactoring.Guru: Composite implements Component and manages child components
 * Child management methods are only in Composite, not in the Component interface
 */
public class GameEntityComposite implements IGameEntity {
    private List<IGameEntity> children;
    private String name;
    private int x;
    private int y;

    public GameEntityComposite(String name, int x, int y) {}

    public String getName() { return null; }
    public int getX() { return 0; }
    public int getY() { return 0; }
    public void render() {}
    public boolean isVisible() { return false; }
    public boolean isSafe() { return false; }
    
    // Child management methods - only in Composite, not in Component interface
    // This follows Refactoring.Guru Composite pattern structure
    public void add(IGameEntity entity) {}
    public void remove(IGameEntity entity) {}
    public IGameEntity getChild(int index) { return null; }
    public int getChildCount() { return 0; }
}

