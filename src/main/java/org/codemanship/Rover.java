package org.codemanship;

import java.util.*;

public class Rover {
    public static final String NORTH = "north";
    public static final String EAST = "east";
    public static final String SOUTH = "south";
    public static final String WEST = "west";
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
        List<String> compass = Arrays.asList(NORTH, EAST, SOUTH, WEST);
        int currentDirectionIndex = compass.indexOf(direction);
        if (currentDirectionIndex == 3) {
            direction = compass.get(0);
        } else {
            direction = compass.get(currentDirectionIndex + 1);
        }
    }
}
