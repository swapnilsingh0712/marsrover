import org.codemanship.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverTurnsRightFromNorthToEast(){

        Rover rover = new Rover("north");
        rover.turnRight();
        assertEquals("east", rover.getDirection());
    }

    @Test
    public void testRoverTurnsRightFromEastToSouth(){
        Rover rover = new Rover("east");
        rover.turnRight();
        assertEquals("south", rover.getDirection());
    }
    @Test
    public void testRoverTurnsRightFromSouthToWest(){
        Rover rover = new Rover("south");
        rover.turnRight();
        assertEquals("west", rover.getDirection());
    }
@Test
public void testRoverTurnRightFromWestToNorth(){
    Rover rover = new Rover("west");
    rover.turnRight();
    assertEquals("north",rover.getDirection());
}

    @Test
    public void testRoverTurnsLeftFromEastToNorth(){
        Rover rover = new Rover("east");
        rover.turnLeft();
        assertEquals("north", rover.getDirection());
    }

}
