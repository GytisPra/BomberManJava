package Visitor;

import Models.Player;

public class VisitablePlayer implements IVisitableEntity {
    private Player player;

    public VisitablePlayer(Player player) {}

    public Player getPlayer() { return null; }
    public void accept(IGameEntityVisitor visitor) {}
}

