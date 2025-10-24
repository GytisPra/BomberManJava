package Models;

import Enums.PowerUpType;

public class PowerUp {
    private int x;
    private int y;
    private PowerUpType type;

    public PowerUp() {}

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

    public PowerUpType getType() {
        return type;
    }

    public void setType(PowerUpType type) {
        this.type = type;
    }

    @Override
    public PowerUp clone() {
        PowerUp p = new PowerUp();
        p.x = this.x;
        p.y = this.y;
        p.type = this.type;
        return p;
    }
}