package Models;

import Enums.PowerUpType;

public class PowerUp {
    private int x;
    private int y;
    private PowerUpType type;

    public PowerUp() {}

    public int getX() { return 0; }
    public void setX(int x) {}
    public int getY() { return 0; }
    public void setY(int y) {}
    public PowerUpType getType() { return null; }
    public void setType(PowerUpType type) {}

    @Override
    public PowerUp clone() { return null; }
}
