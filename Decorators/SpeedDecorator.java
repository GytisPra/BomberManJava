package Decorators;

public class SpeedDecorator extends BasePlayerDecorator {
    private double speedMultiplier;

    public SpeedDecorator(IPlayerDecorator player, double speedMultiplier) { super(player); }

    public double getSpeed() { return 0; }
}
