package ru.sbt.test.refactoring;

public enum Orientation {

    NORTH {
        public Orientation turn() {
            return EAST;
        }

        public Field move(Field position) {
            return position.changeY(1);
        }
    },
    EAST {
        public Orientation turn() {
            return SOUTH;
        }

        public Field move(Field position) {
            return position.changeX(1);
        }
    },
    SOUTH {
        public Orientation turn() {
            return WEST;
        }

        public Field move(Field position) {
            return position.changeY(-1);
        }
    },
    WEST {
        public Orientation turn() {
            return NORTH;
        }

        public Field move(Field position) {
            return position.changeX(-1);
        }
    };

    public abstract Field move(Field position);
    public abstract Orientation turn();
}
