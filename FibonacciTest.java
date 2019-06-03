package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        int actual = Fibonacci.fibonacci(6);
        int expected = 8;

        Assert.assertEquals(expected, actual);
    }
}
