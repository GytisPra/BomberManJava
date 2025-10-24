package PowerUps;

import Models.Player;

public class RangeUpPowerUp implements IPowerUpEffect {
	@Override
	public void applyEffect(Player player) {
		player.setBombRange(player.getBombRange() + 1);
	}

	@Override
	public String getDescription() {
		return "Increases bomb range by 1";
	}
}