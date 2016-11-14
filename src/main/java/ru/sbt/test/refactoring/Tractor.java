package ru.sbt.test.refactoring;

public class Tractor {

	private static final int FIELD_X = 5;
	private static final int FIELD_Y = 5;
	private int positionX = 0;
	private int positionY = 0;
	private Orientation orientation = Orientation.NORTH;

	public void move(String command) {
        if (command.equals("F")) {
			moveForwards();
		} else if (command.equals("T")) {
			turnClockwise();
		}
	}

    public void moveForwards() {
		switch (orientation) {
			case NORTH:
				positionY++;
				break;
			case EAST:
				positionX++;
				break;
			case SOUTH:
				positionY--;
				break;
			case WEST:
				positionX--;
				break;
		}
		if (positionX > FIELD_X || positionY > FIELD_Y) {
			throw new TractorInDitchException();
		}
	}

    public void turnClockwise() {
		switch (orientation) {
			case NORTH:
				orientation = Orientation.EAST;
				break;
			case EAST:
				orientation = Orientation.SOUTH;
				break;
			case SOUTH:
				orientation = Orientation.WEST;
				break;
			case WEST:
				orientation = Orientation.NORTH;
				break;
		}
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public Orientation getOrientation() {
		return orientation;
	}

}
