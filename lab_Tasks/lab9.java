public class CalculatorUnitTesting {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero test passed");
        }

        System.out.println("All tests completed");
    }
}

Input:

First number: 10
Second number: 5

Output:

Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2.0
Division by zero test passed
All tests completed