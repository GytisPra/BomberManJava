package Iterators;

import Models.Player;
import java.util.List;

public class PlayerCollection implements IIterableCollection<Player> {
    private List<Player> players;

    public PlayerCollection(List<Player> players) {}

    public IIterator<Player> createIterator() { return null; }
    public IIterator<Player> createAliveOnlyIterator() { return null; }
}

