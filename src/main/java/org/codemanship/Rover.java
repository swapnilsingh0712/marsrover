package org.codemanship;

import java.util.*;

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

    private static String nextDirection(String currentDirection) {
        List<String> compass = Arrays.asList(NORTH, EAST, SOUTH, WEST);

        int currentDirectionIndex = compass.indexOf(currentDirection);
        if (currentDirectionIndex == 3) {
            currentDirection = compass.get(0);
        } else {
            currentDirection = compass.get(currentDirectionIndex + 1);
        }
        return currentDirection;
    }
}
