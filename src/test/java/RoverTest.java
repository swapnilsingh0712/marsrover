import org.codemanship.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverTurnsRightFromNorth(){

        Rover rover = new Rover();
        assertEquals("east", rover.direction());
    }
}
