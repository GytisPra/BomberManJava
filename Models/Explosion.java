package Models;

import java.time.LocalDateTime;

public class Explosion implements Cloneable {
    private int x;
    private int y;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Explosion() {}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public Explosion clone() {
        try {
            Explosion e = (Explosion) super.clone();
            e.x = this.x;
            e.y = this.y;
            e.createdAt = this.createdAt; // LocalDateTime is immutable, safe to copy by reference
            return e;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError(); // Should never happen
        }
    }
}