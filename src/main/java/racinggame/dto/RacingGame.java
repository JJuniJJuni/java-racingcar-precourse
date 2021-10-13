package racinggame.dto;

import java.util.ArrayList;
import java.util.List;

import nextstep.utils.Randoms;
import racinggame.constant.RacingGameConstant;

public class RacingGame {
	private RacingGameConstant.InputSuccess inputSuccess;
	private RacingCars racingCars;
	private RunCount runCount;

	public RacingGame() {
		this.inputSuccess = RacingGameConstant.InputSuccess.Fail;
	}

	public RacingGameConstant.InputSuccess getInputSuccess() {
		return this.inputSuccess;
	}

	public void setInputSuccess(RacingGameConstant.InputSuccess inputSuccess) {
		this.inputSuccess = inputSuccess;
	}

	public RacingCars getRacingCars() {
		return this.racingCars;
	}

	public void setRacingCars(RacingCars racingCars) {
		this.racingCars = racingCars;
	}

	public RunCount getRunCount() {
		return this.runCount;
	}

	public void setRunCount(RunCount runCount) {
		this.runCount = runCount;
	}

	private RacingGameConstant.MoveFlag goOrStop() {
		return Randoms.pickNumberInRange(0, 9) > 3 ? RacingGameConstant.MoveFlag.Go : RacingGameConstant.MoveFlag.Stop;
	}

	public void turn() {
		for (RacingCar racingCar : this.racingCars.value()) {
			racingCar.move(goOrStop());
		}
	}

	public RacingCars getWinners() {
		Position position = this.racingCars.maxPosition();
		List<RacingCar> winners = new ArrayList<>();
		for (RacingCar racingCar : this.racingCars.value()) {
			addWinner(position, racingCar, winners);
		}
		return new RacingCars(winners);
	}

	private void addWinner(Position position, RacingCar racingCar, List<RacingCar> winners) {
		if (racingCar.getPosition().value() == position.value()) {
			winners.add(racingCar);
		}
	}
}
