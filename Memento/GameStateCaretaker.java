package Memento;

import java.util.Stack;

public class GameStateCaretaker {
    private Stack<GameMemento> mementos;
    private int maxMementos;

    public GameStateCaretaker(int maxMementos) {}

    public void saveMemento(GameMemento memento) {}
    public GameMemento getLastMemento() { return null; }
    public GameMemento popMemento() { return null; }
    public boolean hasMementos() { return false; }
    public int getMementoCount() { return 0; }
    public void clearMementos() {}
}

