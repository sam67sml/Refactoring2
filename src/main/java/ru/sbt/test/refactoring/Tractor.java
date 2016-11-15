package ru.sbt.test.refactoring;

import static ru.sbt.test.refactoring.Field.FIELD_BORDER_X;
import static ru.sbt.test.refactoring.Field.FIELD_BORDER_Y;

public class Tractor {


	private Field field = new Field(0,0);

	private Orientation orientation = Orientation.NORTH;

	public void move(String command) {
        if (command.equals("F")) {
			moveForwards();
		} else if (command.equals("T")) {
			turnClockwise();
		}
	}

    public void moveForwards() {
        field = orientation.move(field);
		if (field.getPosition_X() > FIELD_BORDER_X || field.getPosition_Y() > FIELD_BORDER_Y) {
			throw new TractorInDitchException();
		}
	}

    public void turnClockwise() {
        orientation = orientation.turn();
	}

	int getPositionX() {
		return field.getPosition_X();
	}

	int getPositionY() {
		return field.getPosition_Y();
	}

	Orientation getOrientation() {
		return orientation;
	}

}
