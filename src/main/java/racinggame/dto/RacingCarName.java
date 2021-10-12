package racinggame.dto;

public class RacingCarName {
	private String racingCarName;

	public RacingCarName(String racingCarName) {
		this.racingCarName = racingCarName;
		validate();
	}

	public String getRacingCarName() {
		return racingCarName;
	}

	private void validate() {
		int length = this.racingCarName.length();
		if (length < 1) {
			throw new IllegalArgumentException("길이가 옳바르지 않습니다");
		}
		if (length > 5) {
			throw new IllegalArgumentException("요구 길이는 5이하 입니다");
		}
	}

	@Override
	public String toString() {
		return this.racingCarName;
	}
}
