package racinggame.dto;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarsTest {
	private List<RacingCar> testRacingCars;

	@BeforeEach
	public void setUp() {
		testRacingCars = new ArrayList<>();
		testRacingCars.add(new RacingCar(new RacingCarName("tesla"), new Position(4)));
		testRacingCars.add(new RacingCar(new RacingCarName("tesla"), new Position(4)));
		testRacingCars.add(new RacingCar(new RacingCarName("honda"), new Position(3)));
	}

	@Test
	public void 중복_체크() {
		assertThatThrownBy(() -> new RacingCars(testRacingCars)).isInstanceOf(IllegalArgumentException.class)
			.hasMessage("중복된 이름이 존재합니다");
		testRacingCars.remove(1);
		assertEquals(new RacingCars(testRacingCars).getRacingCars().size(), 2);
	}
}
