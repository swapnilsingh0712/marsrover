import org.codemanship.Compass;
import org.codemanship.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverTurnsRightFromNorthToEast() {

        Rover rover = new Rover(Compass.NORTH);
        rover.turnRight();
        assertEquals(Compass.EAST, rover.getDirection());
    }

    @Test
    public void testRoverTurnsRightFromEastToSouth() {
        Rover rover = new Rover(Compass.EAST);
        rover.turnRight();
        assertEquals(Compass.SOUTH, rover.getDirection());
    }

    @Test
    public void testRoverTurnsRightFromSouthToWest() {
        Rover rover = new Rover(Compass.SOUTH);
        rover.turnRight();
        assertEquals(Compass.WEST, rover.getDirection());
    }

    @Test
    public void testRoverTurnRightFromWestToNorth() {
        Rover rover = new Rover(Compass.WEST);
        rover.turnRight();
        assertEquals(Compass.NORTH, rover.getDirection());
    }

    @Test
    public void testRoverTurnsLeftFromEastToNorth() {
        Rover rover = new Rover(Compass.EAST);
        rover.turnLeft();
        assertEquals(Compass.NORTH, rover.getDirection());
    }
    @Test
    public void testRoverTurnsLeftFromWestToSouth(){}

}
