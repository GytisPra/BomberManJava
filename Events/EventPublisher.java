package Events;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


public class EventPublisher implements IEventPublisher {

    // Map of event type -> list of handlers
    private final Map<Class<?>, List<IEventHandler<? extends IGameEvent>>> handlers = new HashMap<>();

    @Override
    public <T extends IGameEvent> CompletableFuture<Void> publishAsync(T gameEvent) {
        Class<?> eventType = gameEvent.getClass();
        List<IEventHandler<? extends IGameEvent>> registeredHandlers = handlers.getOrDefault(eventType, Collections.emptyList());

        // Cast safely and collect CompletableFutures
        @SuppressWarnings("unchecked")
        List<CompletableFuture<Void>> tasks = registeredHandlers.stream()
                .map(h -> ((IEventHandler<T>) h).handleAsync(gameEvent))
                .collect(Collectors.toList());

        // Combine all tasks
        return CompletableFuture.allOf(tasks.toArray(new CompletableFuture[0]));
    }

    @Override
    public <T extends IGameEvent> void subscribe(IEventHandler<T> handler, Class<T> eventType) {
        handlers.computeIfAbsent(eventType, k -> new ArrayList<>())
                .add(handler);
    }
}
