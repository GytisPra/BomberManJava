package Decorators;

public abstract class BasePlayerDecorator implements IPlayerDecorator {
    protected IPlayerDecorator wrappedPlayer;

    public BasePlayerDecorator(IPlayerDecorator player) {}

    public int getBombCount() { return 0; }
    public int getBombRange() { return 0; }
    public double getSpeed() { return 0; }
}
