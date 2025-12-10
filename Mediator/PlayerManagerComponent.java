package Mediator;

import Models.Player;
import Models.Bomb;
import Models.PowerUp;
import java.util.Map;

public class PlayerManagerComponent extends BaseGameComponent {
    private Map<String, Player> players;

    public String getComponentId() { return null; }
    public void receiveNotification(String eventType, Object data) {}
    private void checkPlayerDamage(Bomb bomb) {}
    private void applyPowerUp(PowerUp powerUp) {}
}

