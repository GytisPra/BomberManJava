package Iterators;

import Models.PowerUp;
import Enums.PowerUpType;
import java.util.List;

public class PowerUpCollection implements IIterableCollection<PowerUp> {
    private List<PowerUp> powerUps;

    public PowerUpCollection(List<PowerUp> powerUps) {}

    public IIterator<PowerUp> createIterator() { return null; }
    public IIterator<PowerUp> createFilteredIterator(PowerUpType filterType) { return null; }
}

