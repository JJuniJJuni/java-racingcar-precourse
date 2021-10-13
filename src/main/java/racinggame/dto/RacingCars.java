package racinggame.dto;

import java.util.ArrayList;
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

	@Override
	public String toString() {
		List<String> racingCarNames = new ArrayList<>();
		for (RacingCar racingCar : racingCars) {
			racingCarNames.add(racingCar.getRacingCarName().getRacingCarName());
		}
		return String.join(",", racingCarNames);
	}
}
