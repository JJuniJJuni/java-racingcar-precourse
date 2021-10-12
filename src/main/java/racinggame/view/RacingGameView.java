package racinggame.view;

import java.util.Arrays;
import java.util.List;

import nextstep.utils.Console;

public class RacingGameView {
	public static List<String> inputRacingCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return Arrays.asList(Console.readLine().replaceAll(" ", "").split(","));
	}
}
