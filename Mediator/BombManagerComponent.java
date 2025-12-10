package Mediator;

import Models.Bomb;
import java.util.List;

public class BombManagerComponent extends BaseGameComponent {
    private List<Bomb> activeBombs;

    public String getComponentId() { return null; }
    public void receiveNotification(String eventType, Object data) {}
    private void checkBombExplosions() {}
}

