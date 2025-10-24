package PowerUps;

import Enums.PowerUpType;

public class PowerUpFactory {
	public static IPowerUpEffect createPowerUp(PowerUpType type) {
		if (type == null) throw new IllegalArgumentException("Power-up type cannot be null");

		switch (type) {
			case BombUp:
				return new BombUpPowerUp();
			case RangeUp:
				return new RangeUpPowerUp();
			case SpeedUp:
				return new SpeedUpPowerUp();
			default:
				throw new IllegalArgumentException("Invalid power-up type");
		}
	}
}