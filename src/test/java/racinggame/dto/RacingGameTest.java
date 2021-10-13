package racinggame.dto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingGameTest {
	private RacingGame racingGame;

	@BeforeEach
	public void setUp() {
		racingGame = new RacingGame();
		List<RacingCar> testRacingCars = new ArrayList<>();
		racingGame.setRacingCars(new RacingCars(testRacingCars));
		testRacingCars.add(new RacingCar(new RacingCarName("tesla"), new Position(4)));
		testRacingCars.add(new RacingCar(new RacingCarName("benz"), new Position(4)));
		testRacingCars.add(new RacingCar(new RacingCarName("honda"), new Position(3)));
	}

	@Test
	public void 최대값_검증() {
		assertEquals(racingGame.getRacingCars().maxPosition().value(), 4);
		addTestMaxRacingCar();
		assertEquals(racingGame.getRacingCars().maxPosition().value(), 10);
	}

	@Test
	public void 우승자_검증() {
		assertEquals(racingGame.getWinners().value().size(), 2);
		addTestMaxRacingCar();
		assertEquals(racingGame.getWinners().value().size(), 1);
	}

	private void addTestMaxRacingCar() {
		racingGame.getRacingCars()
			.value()
			.add(new RacingCar(new RacingCarName("max"), new Position(10)));
	}
}
