package Prototypes;

import Models.Player;

public class PlayerPrototype implements IPrototype<Player> {
    private Player template;

    public PlayerPrototype(Player template) {}

    public Player clone() { return null; }
    public Player cloneShallow() { return null; }
}
