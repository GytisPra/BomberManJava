package Events;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class EventPublisher implements IEventPublisher {
    private final Map<Class<?>, List<Object>> handlers = new ConcurrentHashMap<>();

    @Override
    public <T extends IGameEvent> CompletableFuture<Void> publishAsync(T gameEvent) {
        Class<?> eventType = gameEvent.getClass();
        List<Object> eventHandlers = handlers.get(eventType);

        if (eventHandlers == null) {
            return CompletableFuture.completedFuture(null);
        }

        // Run all handlers asynchronously and wait for completion
        List<CompletableFuture<Void>> tasks = eventHandlers.stream()
                .map(handler -> {
                    @SuppressWarnings("unchecked")
                    IEventHandler<T> typedHandler = (IEventHandler<T>) handler;
                    return typedHandler.handleAsync(gameEvent);
                })
                .collect(Collectors.toList());

        return CompletableFuture.allOf(tasks.toArray(new CompletableFuture[0]));
    }

    @Override
    public <T extends IGameEvent> void subscribe(IEventHandler<T> handler) {
        Class<?> eventType = getEventType(handler);
        handlers.computeIfAbsent(eventType, k -> new ArrayList<>()).add(handler);
    }

    // Utility method to infer the generic type of the handler (optional simplification)
    private <T extends IGameEvent> Class<?> getEventType(IEventHandler<T> handler) {
        return Arrays.stream(handler.getClass().getGenericInterfaces())
                .filter(type -> type.getTypeName().contains("IEventHandler"))
                .findFirst()
                .map(type -> {
                    String typeName = type.getTypeName();
                    try {
                        String genericTypeName = typeName.substring(
                            typeName.indexOf('<') + 1, typeName.indexOf('>')
                        );
                        return Class.forName(genericTypeName);
                    } catch (Exception e) {
                        return Object.class;
                    }
                })
                .orElse(Object.class);
    }
}
