package example.math;

public class MathUtils {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division with zero-handling
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Handling division by zero
        }
        return (double) a / b;
    }
}
