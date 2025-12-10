package Iterators;

import Models.Bomb;
import java.util.List;

public class BombCollection implements IIterableCollection<Bomb> {
    private List<Bomb> bombs;

    public BombCollection(List<Bomb> bombs) {}

    public IIterator<Bomb> createIterator() { return null; }
}

