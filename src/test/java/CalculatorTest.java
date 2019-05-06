import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calum;

    @Before
    public void before() {
        calum = new Calculator("Calum");
    }

    @Test
    public void canAddNumbers() {
        assertEquals( 6, calum.add(2, 4) );
    }

    @Test
    public void canSubtractNumbers() {
        assertEquals( 4, calum.subtract(10, 6) );
    }

    @Test
    public void canMultiplyNumbers() {
        assertEquals( 18, calum.multiply(6, 3) );
    }

    @Test
    public void canDivideNumbers() {
        assertEquals( 3.0, calum.divide(9.0, 3.0), 0.01 );
    }
}
