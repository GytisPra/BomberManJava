package Events;

import java.util.concurrent.CompletableFuture;

public interface IEventHandler<T extends IGameEvent> {
    CompletableFuture<Void> handleAsync(T gameEvent);
}
