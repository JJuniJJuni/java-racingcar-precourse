package racinggame.controller;

import java.util.ArrayList;
import java.util.List;

import racinggame.RacingGameConstant;
import racinggame.dto.RacingCar;
import racinggame.dto.RacingCarName;
import racinggame.dto.RacingCars;
import racinggame.dto.RacingGame;
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

	private RacingCars stringsToRacingCars(List<String> racingCarNamesString) {
		List<RacingCar> racingCars = new ArrayList();
		for (String racingCarNameString : racingCarNamesString) {
			racingCars.add(new RacingCar(new RacingCarName(racingCarNameString)));
		}
		return new RacingCars(racingCars);
	}
}
