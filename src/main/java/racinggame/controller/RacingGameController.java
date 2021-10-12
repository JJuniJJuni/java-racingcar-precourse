package racinggame.controller;

import java.util.ArrayList;
import java.util.List;

import racinggame.RacingGameConstant;
import racinggame.dto.RacingCar;
import racinggame.dto.RacingCarName;
import racinggame.dto.RacingCars;
import racinggame.dto.RacingGame;
import racinggame.dto.RunCount;
import racinggame.view.RacingGameView;

public class RacingGameController {
	private RacingGame racingGame;

	public void run() {
		start();
	}

	private void start() {
		racingGame = new RacingGame();
		while (racingGame.getInputSuccess() == RacingGameConstant.InputSuccess.Fail) {
			racingGame.setRacingCars(inputRacingCarNames());
		}
		racingGame.setInputSuccess(RacingGameConstant.InputSuccess.Fail);
		while (racingGame.getInputSuccess() == RacingGameConstant.InputSuccess.Fail) {
			racingGame.setRunCount(inputRunCount());
		}
	}

	private RacingCars inputRacingCarNames() {
		RacingCars racingCars = null;
		try {
			racingCars = stringsToRacingCars(RacingGameView.inputRacingCarNames());
			racingGame.setInputSuccess(RacingGameConstant.InputSuccess.Success);
		} catch (IllegalArgumentException e) {
			RacingGameView.errorMessage(e.getMessage());
			racingGame.setInputSuccess(RacingGameConstant.InputSuccess.Fail);
		}
		return racingCars;
	}

	private RunCount inputRunCount() {
		RunCount runCount = null;
		try {
			runCount = stringToRunCount(RacingGameView.inputRunCount());
			racingGame.setInputSuccess(RacingGameConstant.InputSuccess.Success);
		} catch (IllegalArgumentException e) {
			RacingGameView.errorMessage(e.getMessage());
			racingGame.setInputSuccess(RacingGameConstant.InputSuccess.Fail);
		}
		return runCount;
	}

	private RunCount stringToRunCount(String runCount) {
		try {
			return new RunCount(Integer.parseInt(runCount));
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("숫자형에 맞지않은 입력 값이 들어왔습니다");
		}
	}

	private RacingCars stringsToRacingCars(List<String> racingCarNamesString) {
		List<RacingCar> racingCars = new ArrayList();
		for (String racingCarNameString : racingCarNamesString) {
			racingCars.add(new RacingCar(new RacingCarName(racingCarNameString)));
		}
		return new RacingCars(racingCars);
	}

}
