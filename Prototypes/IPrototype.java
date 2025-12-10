package Prototypes;

public interface IPrototype<T> {
    T clone();
    T cloneShallow();
}
