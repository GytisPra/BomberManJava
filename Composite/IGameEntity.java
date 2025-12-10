package Composite;

/**
 * Composite Pattern - Component interface for game entities
 * According to Refactoring.Guru: Component defines common operations for both Leaf and Composite
 * Child management methods (Add, Remove, GetChild) are only in Composite, not in Component interface
 */
public interface IGameEntity {
    String getName();
    int getX();
    int getY();
    void render();
    boolean isVisible();
    boolean isSafe();
}

