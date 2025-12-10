package Decorators;

public class BombRangeDecorator extends BasePlayerDecorator {
    private int additionalRange;

    public BombRangeDecorator(IPlayerDecorator player, int additionalRange) { super(player); }

    public int getBombRange() { return 0; }
}
