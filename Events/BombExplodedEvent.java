package Events;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Models.Explosion;
import Models.Bomb;

public class BombExplodedEvent implements IGameEvent
{
    public String RoomId = "";
    public Bomb Bomb = new Bomb();
    public List<Explosion> Explosions = new ArrayList<>();
    public LocalDateTime Timestamp = LocalDateTime.now();

    @Override
    public String getRoomId() {
        return RoomId;
    }
    @Override
    public LocalDateTime getTimestamp() {
        return Timestamp;
    }
    @Override
    public void setRoomId(String roomId) {
        RoomId = roomId;
    }
    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        Timestamp = timestamp;
    }

    public Bomb getBomb() {
        return Bomb;
    }

    public void setBomb(Bomb bomb) {
        Bomb = bomb;
    }

    public List<Explosion> getExplosions() {
        return Explosions;
    }

    public void setExplosions(List<Explosion> explosions) {
        Explosions = explosions;
    }

    public void addExplosion(Explosion explosion) {
        Explosions.add(explosion);
    }
}