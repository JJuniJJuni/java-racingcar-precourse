package racinggame.dto;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RacingCarNameTest {
	@Test
	public void 자동차이름_길이_검증() {
		assertThatThrownBy(() -> new RacingCarName("")).isInstanceOf(IllegalArgumentException.class)
			.hasMessage("길이가 옳바르지 않습니다");
		assertThatThrownBy(() -> new RacingCarName("testcar")).isInstanceOf(IllegalArgumentException.class)
			.hasMessage("요구 길이는 5이하 입니다");
		assertEquals((new RacingCarName("tesla")).getRacingCarName().length(), 5);
	}
}
