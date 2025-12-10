package TemplateMethod;

import Models.GameBoard;

public abstract class GameEntityProcessor {
    
    // Template method
    public void processEntity(GameBoard board, int x, int y) {}
    
    // Primitive operations - implemented by subclasses
    protected abstract boolean validatePosition(GameBoard board, int x, int y);
    protected abstract Object getEntity(GameBoard board, int x, int y);
    protected abstract ProcessingResult processEntityInternal(Object entity, GameBoard board, int x, int y);
    
    // Hook methods
    protected void onBeforeProcessing(Object entity, int x, int y) {}
    protected void onAfterProcessing(Object entity, ProcessingResult result, int x, int y) {}
    protected void onValidationFailed(int x, int y) {}
    protected void onEntityNotFound(int x, int y) {}
}

