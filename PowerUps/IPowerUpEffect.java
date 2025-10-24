package PowerUps;

import Models.Player;

public interface IPowerUpEffect {
	void applyEffect(Player player);
	String getDescription();
}