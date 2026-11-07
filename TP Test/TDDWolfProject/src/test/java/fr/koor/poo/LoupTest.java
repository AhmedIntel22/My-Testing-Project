package fr.koor.poo;

/**
 *
 * @author ahmed
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoupTest {
    @Test
    void testInitialPositionAtNorth() {
        Loup wolf = new Loup(); 
        assertEquals(Orientation.NORD, wolf.getOrientation());
    }
    @Test
    void testTurnOnce() {
        Loup wolf = new Loup();
        wolf.tourner();
        assertEquals(Orientation.EST, wolf.getOrientation());
    }
}


