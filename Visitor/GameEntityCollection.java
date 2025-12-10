package Visitor;

import java.util.List;

public class GameEntityCollection {
    private List<IVisitableEntity> entities;

    public void add(IVisitableEntity entity) {}
    public void accept(IGameEntityVisitor visitor) {}
    public int getCount() { return 0; }
}

