import org.codemanship.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverTurnsRightFromNorth(){

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
    public void testRoverTurnsLeftFromEast(){
        Rover rover = new Rover("east");
        rover.turnLeft();
        assertEquals("north", rover.getDirection());
    }

}
