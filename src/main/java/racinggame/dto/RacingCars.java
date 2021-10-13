package racinggame.dto;

import java.util.List;

public class RacingCars {
	private List<RacingCar> racingCars;

	public RacingCars(List<RacingCar> racingCars) {
		this.racingCars = racingCars;
	}

	public List<RacingCar> getRacingCars() {
		return racingCars;
	}

	public Position maxPosition() {
		int position = -1;
		for (RacingCar racingCar : this.racingCars) {
			position = Integer.max(position, racingCar.getPosition().getPosition());
		}
		return new Position(position);
	}
}
