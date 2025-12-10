package Visitor;

import Models.Bomb;

public class VisitableBomb implements IVisitableEntity {
    private Bomb bomb;

    public VisitableBomb(Bomb bomb) {}

    public Bomb getBomb() { return null; }
    public void accept(IGameEntityVisitor visitor) {}
}

