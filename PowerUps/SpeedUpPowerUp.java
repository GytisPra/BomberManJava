package PowerUps;

import Models.Player;
import Strategies.SpeedBoostMovementStrategy;
import Strategies.MovementCooldownTracker;

public class SpeedUpPowerUp implements IPowerUpEffect {
	@Override
	public void applyEffect(Player player) {
		MovementCooldownTracker.addSpeedBoost(player.getId());

		if (!(player.getMovementStrategy() instanceof SpeedBoostMovementStrategy)) {
			player.setMovementStrategy(new SpeedBoostMovementStrategy());
		}
	}

	@Override
	public String getDescription() {
		int boostReduction = 20;
		return String.format("Decreases movement delay by %dms (stackable)", boostReduction);
	}
}