package racinggame.dto;

import racinggame.constant.RacingGameConstant;

public class RacingCar {
	private RacingCarName racingCarName;
	private Position position;

	public RacingCar(RacingCarName racingCarName, Position position) {
		this.racingCarName = racingCarName;
		this.position = position;
	}
	
	public RacingCarName getRacingCarName() {
		return racingCarName;
	}

	public Position getPosition() {
		return position;
	}

	public void move(RacingGameConstant.MoveFlag moveFlag) {
		if (moveFlag == RacingGameConstant.MoveFlag.Go) {
			this.position.plus();
		}
	}
}
