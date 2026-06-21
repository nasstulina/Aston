import org.junit.jupiter.api.Test;

import static org.example.MathCalculations.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void factorialTest(){
        assertEquals(120, factorial(5));
    }

    @Test
    public void areaTriangleTest(){
        assertEquals(6.0, areaTriangle(3, 4, 5));
    }

    @Test
    public void calculationTest(){
        assertEquals(11, calculation(5, 6, "+"));
        assertEquals(-1, calculation(5, 6, "-"));
        assertEquals(30, calculation(5, 6, "*"));
        assertEquals(2, calculation(12, 6, "/"));
    }

    @Test
    public void compareNumbersTest(){
        assertEquals("5 < 6", compareNumbers(5, 6));
        assertEquals("6 > 5", compareNumbers(6, 5));
        assertEquals("6 = 6", compareNumbers(6, 6));
    }
}
