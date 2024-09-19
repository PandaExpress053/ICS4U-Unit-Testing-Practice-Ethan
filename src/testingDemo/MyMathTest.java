package testingDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers2() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test
    public void pow1() {
        assertEquals(1.0/8.0, MyMath.power(2, -3));
    }
    @Test
    public void pow2() {
        assertEquals(8, MyMath.power(2, 3));
    }
    @Test
    public void pow3() {
        assertEquals(1, MyMath.power(2, 0));
    }
}