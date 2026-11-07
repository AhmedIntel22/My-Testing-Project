package fr.koor.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ahmed
 */

public class RationalTest {

    public RationalTest() {
    }

    @Test
    public void testAddition() {
        System.out.println("testAddition");
        Rational r1 = new Rational(1, 3);
        Rational r2 = new Rational(2, 1);
        Rational result = r1.add(r2);
        
        assertEquals(7, result.getNumerator(), "Numerator should be 7");
        assertEquals(3, result.getDenominator(), "Denominator should be 3");
    }

    @Test
    public void testSimplify() {
        System.out.println("testSimplify");
        Rational r = new Rational(5005, 2431);
        r.simplify();
        assertEquals(35, r.getNumerator());
        assertEquals(17, r.getDenominator());
    }

    @Test
    public void testBadDenominator() {
        System.out.println("testBadDenominator");
        assertThrows(IllegalArgumentException.class, () -> {
            new Rational(1, 0);
        });
    }
}