package Iterators;

import Models.Bomb;
import java.util.List;

public class BombIterator implements IIterator<Bomb> {
    private List<Bomb> bombs;
    private int currentIndex;

    public BombIterator(List<Bomb> bombs) {}

    public boolean hasNext() { return false; }
    public Bomb next() { return null; }
    public void reset() {}
}

