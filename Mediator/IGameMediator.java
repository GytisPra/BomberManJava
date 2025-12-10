package Mediator;

public interface IGameMediator {
    void notify(Object sender, String eventType, Object data);
    void registerComponent(IGameComponent component);
    void unregisterComponent(IGameComponent component);
}

