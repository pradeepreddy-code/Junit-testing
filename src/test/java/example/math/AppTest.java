package example.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-3, mathUtils.add(-5, 2));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-7, mathUtils.subtract(-5, 2));
        assertEquals(0, mathUtils.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(0, mathUtils.multiply(0, 5));
        assertEquals(-10, mathUtils.multiply(-5, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3));
        assertEquals(-2.5, mathUtils.divide(-5, 2));
        assertEquals(-1.0, mathUtils.divide(5, 0)); 
    }
}
