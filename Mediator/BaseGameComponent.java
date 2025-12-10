package Mediator;

public abstract class BaseGameComponent implements IGameComponent {
    protected IGameMediator mediator;

    public abstract String getComponentId();

    public void setMediator(IGameMediator mediator) {}
    public void sendNotification(String eventType, Object data) {}
    public abstract void receiveNotification(String eventType, Object data);
}

