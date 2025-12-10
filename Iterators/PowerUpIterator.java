package Iterators;

import Models.PowerUp;
import Enums.PowerUpType;
import java.util.List;

public class PowerUpIterator implements IIterator<PowerUp> {
    private List<PowerUp> powerUps;
    private int currentIndex;
    private PowerUpType filterType;

    public PowerUpIterator(List<PowerUp> powerUps, PowerUpType filterType) {}

    public boolean hasNext() { return false; }
    public PowerUp next() { return null; }
    public void reset() {}
}

