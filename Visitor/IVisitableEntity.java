package Visitor;

public interface IVisitableEntity {
    void accept(IGameEntityVisitor visitor);
}

