package TemplateMethod;

import Models.GameBoard;

public final class PowerUpProcessor extends GameEntityProcessor {
    
    protected boolean validatePosition(GameBoard board, int x, int y) { return false; }
    protected Object getEntity(GameBoard board, int x, int y) { return null; }
    protected ProcessingResult processEntityInternal(Object entity, GameBoard board, int x, int y) { return null; }
    protected void onBeforeProcessing(Object entity, int x, int y) {}
    protected void onAfterProcessing(Object entity, ProcessingResult result, int x, int y) {}
}

