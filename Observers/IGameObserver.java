package Observers;

import Events.IGameEvent;

public interface IGameObserver
{
    void onGameEvent(IGameEvent gameEvent);
}
