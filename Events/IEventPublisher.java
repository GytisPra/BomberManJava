package Events;

import java.util.concurrent.CompletableFuture;

public interface IEventPublisher {
    <T extends IGameEvent> CompletableFuture<Void> publishAsync(T gameEvent);
    <T extends IGameEvent> void subscribe(IEventHandler<T> handler);
}
