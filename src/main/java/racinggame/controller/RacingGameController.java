package racinggame.controller;

import java.util.Arrays;
import java.util.List;

import racinggame.view.RacingGameView;

public class RacingGameController {

	public void run() {
		start();
	}

	private void start() {
		List<String> racingCarNames = inputRacingCarNames();
	}

	private List<String> inputRacingCarNames() {
		return Arrays.asList(RacingGameView.inputRacingCarNames().split(","));
	}
}
