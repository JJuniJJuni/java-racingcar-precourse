package racinggame.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RacingCars {
	private List<RacingCar> racingCars;

	public RacingCars(List<RacingCar> racingCars) {
		this.racingCars = racingCars;
		validate();
	}

	public List<RacingCar> value() {
		return racingCars;
	}

	public Position maxPosition() {
		int position = -1;
		for (RacingCar racingCar : this.racingCars) {
			position = Integer.max(position, racingCar.getPosition().value());
		}
		return new Position(position);
	}

	private Set<String> getRacingCarNameSet() {
		Set<String> set = new HashSet<>();
		for (RacingCar racingCar : racingCars) {
			set.add(racingCar.value().value());
		}
		return set;
	}

	public void validate() {
		int racingCarCount = racingCars.size();
		if (racingCarCount != getRacingCarNameSet().size()) {
			throw new IllegalArgumentException("중복된 이름이 존재합니다");
		}
	}

	@Override
	public String toString() {
		List<String> racingCarNames = new ArrayList<>();
		for (RacingCar racingCar : racingCars) {
			racingCarNames.add(racingCar.value().value());
		}
		return String.join(",", racingCarNames);
	}
}
