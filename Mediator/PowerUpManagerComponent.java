package Mediator;

import Models.PowerUp;
import Models.Player;
import java.util.List;

public class PowerUpManagerComponent extends BaseGameComponent {
    private List<PowerUp> activePowerUps;

    public String getComponentId() { return null; }
    public void receiveNotification(String eventType, Object data) {}
    private void trySpawnPowerUp(int x, int y) {}
    private void checkPowerUpCollection(Player player) {}
}

