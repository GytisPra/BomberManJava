package Observers;

import java.util.ArrayList;
import java.util.List;

import Events.IGameEvent;

public class GameEventSubject implements IGameSubject {
    private final List<IGameObserver> observers = new ArrayList<IGameObserver>();
    private final Object lockObject = new Object();

    @Override
    public void Attach(IGameObserver observer) {
        synchronized (lockObject) {
            if (!observers.contains(observer)) {
                observers.add(observer);
                System.out.println("GameEventSubject: Attached observer " + observer.getClass().getSimpleName());
            }
        }
    }

    @Override
    public void Detach(IGameObserver observer) {
        synchronized (lockObject) {
            if (observers.remove(observer)) {
                System.out.println("GameEventSubject: Detached observer " + observer.getClass().getSimpleName());
            }
        }
    }

    @Override
    public void Notify(IGameEvent gameEvent) {
        List<IGameObserver> observersCopy;
        synchronized (lockObject) {
            observersCopy = new ArrayList<IGameObserver>(observers);
        }

        for (IGameObserver observer : observersCopy) {
            try {
                observer.onGameEvent(gameEvent);
            } catch (Exception ex) {
                System.out.println("GameEventSubject: Error notifying observer -" + ex.getMessage());
            }
        }
    }
}
