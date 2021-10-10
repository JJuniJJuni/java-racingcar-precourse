package racinggame;

import racinggame.controller.RacingGameController;

public class Application {
	private static RacingGameController racingGameController = new RacingGameController();

	public static void main(String[] args) {
		racingGameController.run();
	}
}
