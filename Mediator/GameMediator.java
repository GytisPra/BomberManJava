package Mediator;

import java.util.List;
import java.util.Map;

public class GameMediator implements IGameMediator {
    private List<IGameComponent> components;
    private Map<String, List<IGameComponent>> eventSubscribers;

    public void registerComponent(IGameComponent component) {}
    public void unregisterComponent(IGameComponent component) {}
    public void notify(Object sender, String eventType, Object data) {}
    public void subscribeToEvent(String eventType, IGameComponent component) {}
}

