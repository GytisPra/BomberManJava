package Singletons;

import java.time.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public final class GameLogger {
    private static GameLogger instance;

    public enum LogLevel {
        DEBUG, INFO, WARNING, ERROR
    }

    private static class LogEntry {
        LocalDateTime timestamp;
        LogLevel level;
        String category;
        String message;
    }

    private final ConcurrentLinkedQueue<LogEntry> logQueue = new ConcurrentLinkedQueue<>();
    private final int maxLogEntries = 1000;

    private GameLogger() {
    }

    public static synchronized GameLogger getInstance() {
        if (instance == null) {
            instance = new GameLogger();
        }
        return instance;
    }

    public void logDebug(String category, String message) {
        log(LogLevel.DEBUG, category, message);
    }

    public void logInfo(String category, String message) {
        log(LogLevel.INFO, category, message);
    }

    public void logWarning(String category, String message) {
        log(LogLevel.WARNING, category, message);
    }

    public void logError(String category, String message) {
        log(LogLevel.ERROR, category, message);
    }

    private void log(LogLevel level, String category, String message) {
        LogEntry entry = new LogEntry();
        entry.timestamp = LocalDateTime.now();
        entry.level = level;
        entry.category = category;
        entry.message = message;

        logQueue.add(entry);
        while (logQueue.size() > maxLogEntries) {
            logQueue.poll();
        }

        String colorCode;
        switch (level) {
            case ERROR:
                colorCode = "\u001B[31m";
                break;
            case WARNING:
                colorCode = "\u001B[33m";
                break;
            case INFO:
                colorCode = "\u001B[32m";
                break;
            default:
                colorCode = "\u001B[0m";
                break;
        }

        System.out.println(colorCode + String.format("[%tT] [%s] [%s] %s", entry.timestamp, level, category, message)
                + "\u001B[0m");
    }

    public List<String> getRecentLogs(int count) {
        return logQueue.stream()
                .skip(Math.max(0, logQueue.size() - count))
                .map(e -> String.format("[%tT] [%s] [%s] %s", e.timestamp, e.level, e.category, e.message))
                .collect(Collectors.toList());
    }

    public void clearLogs() {
        logQueue.clear();
        System.out.println("Logs cleared");
    }
}
