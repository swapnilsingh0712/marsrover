package org.codemanship;

import java.util.Arrays;
import java.util.List;

public class Compass {
    public static final String NORTH = "north";
    public static final String EAST = "east";
    public static final String SOUTH = "south";
    public static final String WEST = "west";

    static String nextDirection(String currentDirection) {
        List<String> compass = Arrays.asList(NORTH, EAST, SOUTH, WEST);

        int currentDirectionIndex = compass.indexOf(currentDirection);
        if (currentDirectionIndex == 3) {
            return  compass.get(0);
        } else {
           return compass.get(currentDirectionIndex + 1);
        }

    }
}
