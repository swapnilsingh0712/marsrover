package org.codemanship;

import static org.codemanship.Compass.*;

public class Rover {
    private String direction;

    public Rover(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        direction = NORTH;
    }

    public void turnRight() {
        direction = nextDirection(direction);
    }

}
