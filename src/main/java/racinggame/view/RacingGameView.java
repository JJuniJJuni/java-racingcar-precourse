package racinggame.view;

import java.util.Arrays;
import java.util.List;

import nextstep.utils.Console;
import racinggame.dto.RacingCar;
import racinggame.dto.RacingCars;

public class RacingGameView {
	public static List<String> inputRacingCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return Arrays.asList(Console.readLine().replaceAll(" ", "").split(","));
	}

	public static String inputRunCount() {
		System.out.println("시도할 회수는 몇회인가요?");
		return Console.readLine().replaceAll(" ", "");
	}

	public static void printResultMessage() {
		System.out.println();
		System.out.println("실행 결과");
	}

	public static void printCurrentRacingCars(RacingCars racingCars) {
		for (RacingCar racingCar : racingCars.getRacingCars()) {
			System.out.print(racingCar.getRacingCarName() + " : ");
			printBar(racingCar.getPosition().getPosition());
		}
		System.out.println();
	}

	private static void printBar(Integer count) {
		for (int i = 0; i < count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void errorMessage(String message) {
		System.out.println("[ERROR] " + message);
	}
}
