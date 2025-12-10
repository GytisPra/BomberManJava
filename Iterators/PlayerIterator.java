package Iterators;

import Models.Player;
import java.util.List;

public class PlayerIterator implements IIterator<Player> {
    private List<Player> players;
    private int currentIndex;
    private boolean aliveOnly;

    public PlayerIterator(List<Player> players, boolean aliveOnly) {}

    public boolean hasNext() { return false; }
    public Player next() { return null; }
    public void reset() {}
}

