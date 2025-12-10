package Singletons;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class GameLogger {
    private static GameLogger instance;

    public enum LogLevel { DEBUG, INFO, WARNING, ERROR }

    private ConcurrentLinkedQueue<Object> logQueue;
    private int maxLogEntries;

    private GameLogger() {}

    public static synchronized GameLogger getInstance() { return null; }

    public void logDebug(String category, String message) {}
    public void logInfo(String category, String message) {}
    public void logWarning(String category, String message) {}
    public void logError(String category, String message) {}
    private void log(LogLevel level, String category, String message) {}
    public List<String> getRecentLogs(int count) { return null; }
    public void clearLogs() {}
}
