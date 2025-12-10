package Observers;

import java.util.List;
import Events.IGameEvent;

public class GameEventSubject implements IGameSubject {
    private List<IGameObserver> observers;
    private IGameEvent lastEvent;

    public void attach(IGameObserver observer) {}
    public void detach(IGameObserver observer) {}
    public void notifyObservers() {}
    public void setEvent(IGameEvent event) {}
}
