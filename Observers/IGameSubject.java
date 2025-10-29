package Observers;

import Events.IGameEvent;

public interface IGameSubject {
    void Attach(IGameObserver observer);

    void Detach(IGameObserver observer);

    void Notify(IGameEvent gameEvent);
}
