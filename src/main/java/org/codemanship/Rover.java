package org.codemanship;

public class Rover {
    private String direction ;

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
        if (direction.equals("east")){
            direction = "south";
        }
        else if (direction.equals("south")){
            direction = "west";
        }
        else if (direction.equals("west")){
          direction = "north";
        }
        else{
            direction = "east";
        }
    }
}
