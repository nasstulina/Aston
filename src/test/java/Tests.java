import org.testng.annotations.Test;

import static org.example.MathCalculations.*;
import static org.testng.Assert.assertEquals;

public class Tests {

    @Test
    public void factorialTest(){
        assertEquals(factorial(5), 120);
    }

    @Test
    public void areaTriangleTest(){
        assertEquals(areaTriangle(3, 4, 5), 6.0);
    }

    @Test
    public void calculationTest(){
        assertEquals(calculation(5, 6, "+"), 11);
        assertEquals(calculation(5, 6, "-"), -1);
        assertEquals(calculation(5, 6, "*"), 30);
        assertEquals(calculation(7, 2, "/"), 3.5);
    }

    @Test
    public void compareNumbersTest(){
        assertEquals(compareNumbers(5, 6), "5 < 6");
        assertEquals(compareNumbers(6, 5), "6 > 5");
        assertEquals(compareNumbers(6, 6), "6 = 6");
    }
}
