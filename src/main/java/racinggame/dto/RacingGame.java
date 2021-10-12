package racinggame.dto;

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
}
