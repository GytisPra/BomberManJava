package Models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Bomb implements Cloneable {
    private String id = UUID.randomUUID().toString();
    private int x;
    private int y;
    private String playerId = "";
    private LocalDateTime placedAt = LocalDateTime.now();
    private int range = 2;

    public Bomb() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public String getPlayerId() { return playerId; }
    public void setPlayerId(String playerId) { this.playerId = playerId; }

    public LocalDateTime getPlacedAt() { return placedAt; }
    public void setPlacedAt(LocalDateTime placedAt) { this.placedAt = placedAt; }

    public int getRange() { return range; }
    public void setRange(int range) { this.range = range; }

    @Override
    public Bomb clone() {
        try {
            Bomb b = (Bomb) super.clone();
            b.id = this.id;
            b.x = this.x;
            b.y = this.y;
            b.playerId = this.playerId;
            b.placedAt = this.placedAt;
            b.range = this.range;
            return b;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}