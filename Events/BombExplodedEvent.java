package Events;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Models.Bomb;
import Models.Explosion;

public class BombExplodedEvent implements IGameEvent {

    private String roomId = "";
    private Bomb bomb = new Bomb();
    private List<Explosion> explosions = new ArrayList<>();
    private LocalDateTime timestamp = LocalDateTime.now();

    // --- Getters and Setters ---
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Bomb getBomb() {
        return bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }

    public List<Explosion> getExplosions() {
        return explosions;
    }

    public void setExplosions(List<Explosion> explosions) {
        this.explosions = explosions;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
