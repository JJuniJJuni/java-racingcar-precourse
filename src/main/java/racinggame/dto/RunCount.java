package racinggame.dto;

public class RunCount {
	private Integer runCount;

	public RunCount(int runCount) {
		this.runCount = runCount;
		validate();
	}

	private void validate() {
		if (this.runCount < 1) {
			throw new IllegalArgumentException("시도 회수는 0보다 큰 양수여야 합니다");
		}
	}

	public Integer value() {
		return this.runCount;
	}
}
