package racinggame.dto;

import java.util.List;

public class RacingCars {
	List<RacingCar> racingCars;

	public RacingCars(List<RacingCar> racingCars) {
		this.racingCars = racingCars;
	}

	public List<RacingCar> getRacingCars() {
		return racingCars;
	}
}
