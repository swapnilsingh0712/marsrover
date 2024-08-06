package org.codemanship;

import java.util.*;

public class Rover {
    private String direction;

    public Rover(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        direction = "north";
    }

    public void turnRight() {
        List<String> compass = Arrays.asList("north", "east", "south", "west");
        int currentDirectionIndex = compass.indexOf(direction);
        if (currentDirectionIndex == 3) {
            direction = compass.get(0);
        } else {
            direction = compass.get(currentDirectionIndex + 1);
        }
    }
}
