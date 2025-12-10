package Models;

import java.time.LocalDateTime;

public class Explosion implements Cloneable {
    private int x;
    private int y;
    private LocalDateTime createdAt;

    public Explosion() {}

    public int getX() { return 0; }
    public void setX(int x) {}
    public int getY() { return 0; }
    public void setY(int y) {}
    public LocalDateTime getCreatedAt() { return null; }
    public void setCreatedAt(LocalDateTime createdAt) {}

    @Override
    public Explosion clone() { return null; }
}
