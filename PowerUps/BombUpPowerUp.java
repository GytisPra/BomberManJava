package PowerUps;

import Models.Player;

public class BombUpPowerUp implements IPowerUpEffect {
	@Override
	public void applyEffect(Player player) {
		// assumes Player has getBombCount() and setBombCount(int)
		player.setBombCount(player.getBombCount() + 1);
	}

	@Override
	public String getDescription() {
		return "Increases bomb count by 1";
	}
}