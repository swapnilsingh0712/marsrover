import org.codemanship.Rover;
import org.junit.jupiter.api.Test;

import static org.codemanship.Compass.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverTurnsRightFromNorthToEast() {

        Rover rover = new Rover(NORTH);
        rover.turnRight();
        assertEquals(EAST, rover.getDirection());
    }

    @Test
    public void testRoverTurnsRightFromEastToSouth() {
        Rover rover = new Rover(EAST);
        rover.turnRight();
        assertEquals(SOUTH, rover.getDirection());
    }

    @Test
    public void testRoverTurnsRightFromSouthToWest() {
        Rover rover = new Rover(SOUTH);
        rover.turnRight();
        assertEquals(WEST, rover.getDirection());
    }

    @Test
    public void testRoverTurnRightFromWestToNorth() {
        Rover rover = new Rover(WEST);
        rover.turnRight();
        assertEquals(NORTH, rover.getDirection());
    }

    @Test
    public void testRoverTurnsLeftFromEastToNorth() {
        Rover rover = new Rover(EAST);
        rover.turnLeft();
        assertEquals(NORTH, rover.getDirection());
    }
    @Test
    public void testRoverTurnsLeftFromWestToSouth(){}

}
