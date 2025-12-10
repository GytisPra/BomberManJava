package Observers;

public interface IGameSubject {
    void attach(IGameObserver observer);
    void detach(IGameObserver observer);
    void notifyObservers();
}
