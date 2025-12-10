package Visitor;

import Models.PowerUp;

public class VisitablePowerUp implements IVisitableEntity {
    private PowerUp powerUp;

    public VisitablePowerUp(PowerUp powerUp) {}

    public PowerUp getPowerUp() { return null; }
    public void accept(IGameEntityVisitor visitor) {}
}

