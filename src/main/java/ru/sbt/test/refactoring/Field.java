package ru.sbt.test.refactoring;

/**
 * JavaSchool SBT
 * Created by Sam on 16.11.2016.
 */
public class Field {
    public static final int FIELD_BORDER_X = 5;
    public static final int FIELD_BORDER_Y = 5;
    private final int position_X;
    private final int position_Y;

    public Field(int position_x, int position_y) {
        position_X = position_x;
        position_Y = position_y;
    }

    public Field changeX(int value) {
        return new Field(position_X + value, position_Y);
    }

    public Field changeY(int value) {
        return new Field(position_X, position_Y + value);
    }

    public int getPosition_X() {
        return position_X;
    }

    public int getPosition_Y() {
        return position_Y;
    }
}
