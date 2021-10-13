package racinggame.dto;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RunCountTest {
	@Test
	public void 시도_회수_양수_검증() {
		assertThatThrownBy(() -> new RunCount(0)).isInstanceOf(IllegalArgumentException.class)
			.hasMessage("시도 회수는 0보다 큰 양수여야 합니다");
		assertThatThrownBy(() -> new RunCount(-1)).isInstanceOf(IllegalArgumentException.class)
			.hasMessage("시도 회수는 0보다 큰 양수여야 합니다");
		assertEquals(new RunCount(4).value(), 4);
	}
}
