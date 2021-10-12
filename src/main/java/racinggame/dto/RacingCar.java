package racinggame.dto;

public class RacingCar {
	private RacingCarName racingCarName;

	public RacingCar(RacingCarName racingCarName) {
		this.racingCarName = racingCarName;
	}

	public RacingCarName getRacingCarName() {
		return racingCarName;
	}
}
