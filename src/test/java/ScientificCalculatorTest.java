import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {
/*Hello*/
    @Test
    public void testSquareRootOperation() {
        assertEquals(2.0, Math.sqrt(4), 0.0001); // Square root of 4 should be 2
        assertEquals(3.0, Math.sqrt(9), 0.0001); // Square root of 9 should be 3
    }

    @Test
    public void testFactorialOperation() {
        assertEquals(1, calculateFactorial(0));
        assertEquals(1, calculateFactorial(1));
        assertEquals(120, calculateFactorial(5)); // 5! = 5 * 4 * 3 * 2 * 1 = 120
    }

    @Test
    public void testNaturalLogarithmOperation() {
        assertEquals(0.0, Math.log(1), 0.0001); // ln(1) = 0
        assertEquals(1.0, Math.log(Math.E), 0.0001); // ln(e) = 1
    }

    @Test
    public void testPowerOperation() {
        assertEquals(8.0, Math.pow(2, 3), 0.0001); // 2^3 = 8
        assertEquals(1.0, Math.pow(10, 0), 0.0001); // Any number raised to the power of 0 is 1
    }

    @Test
    public void testBasicArithmeticOperations() {
        assertEquals(5.0, 3 + 2, 0.0001); // Addition
        assertEquals(1.0, 3 - 2, 0.0001); // Subtraction
        assertEquals(6.0, 3 * 2, 0.0001); // Multiplication
        assertEquals(1.5, 3.0 / 2, 0.0001); // Division
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, addition(2, 3), 0.0001); // 2 + 3 = 5
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, subtraction(5, 3), 0.0001); // 5 - 3 = 2
    }

    @Test
    public void testMultiplication() {
        assertEquals(10.0, multiplication(2, 5), 0.0001); // 2 * 5 = 10
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, division(6, 3), 0.0001); // 6 / 3 = 2
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    private double addition(double a, double b) {
        return a + b;
    }

    private double subtraction(double a, double b) {
        return a - b;
    }

    private double multiplication(double a, double b) {
        return a * b;
    }

    private double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero. Please enter a non-zero divisor.");
        }
    }
}
