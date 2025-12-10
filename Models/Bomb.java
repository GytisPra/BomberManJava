package Models;

import java.time.LocalDateTime;

public class Bomb implements Cloneable {
    private String id;
    private int x;
    private int y;
    private String playerId;
    private LocalDateTime placedAt;
    private int range;

    public Bomb() {}

    public String getId() { return null; }
    public void setId(String id) {}
    public int getX() { return 0; }
    public void setX(int x) {}
    public int getY() { return 0; }
    public void setY(int y) {}
    public String getPlayerId() { return null; }
    public void setPlayerId(String playerId) {}
    public LocalDateTime getPlacedAt() { return null; }
    public void setPlacedAt(LocalDateTime placedAt) {}
    public int getRange() { return 0; }
    public void setRange(int range) {}

    @Override
    public Bomb clone() { return null; }
}
