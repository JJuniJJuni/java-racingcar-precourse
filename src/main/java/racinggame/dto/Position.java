package racinggame.dto;

public class Position {
	private int position;

	public Position(Integer position) {
		this.position = position;
	}

	public void plus() {
		this.position++;
	}

	public int value() {
		return position;
	}
}
