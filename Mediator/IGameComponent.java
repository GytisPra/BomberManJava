package Mediator;

public interface IGameComponent {
    String getComponentId();
    void receiveNotification(String eventType, Object data);
    void sendNotification(String eventType, Object data);
    void setMediator(IGameMediator mediator);
}

