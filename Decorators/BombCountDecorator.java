package Decorators;

public class BombCountDecorator extends BasePlayerDecorator {
    private int additionalBombs;

    public BombCountDecorator(IPlayerDecorator player, int additionalBombs) { super(player); }

    public int getBombCount() { return 0; }
}
