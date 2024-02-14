import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition (a+b)");
            System.out.println("2. Subtraction (a-b)");
            System.out.println("3. Multiplication (a*b)");
            System.out.println("4. Division(a/b)");
            System.out.println("5. Square Root (√x)");
            System.out.println("6. Factorial (x!)");
            System.out.println("7. Natural Logarithm (ln(x))");
            System.out.println("8. Power (x^b)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition(scanner);
                    break;
                case 2:
                    subtraction(scanner);
                    break;
                case 3:
                    multiplication(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    squareRootOperation(scanner);
                    break;
                case 6:
                    factorialOperation(scanner);
                    break;
                case 7:
                    naturalLogarithmOperation(scanner);
                    break;
                case 8:
                    powerOperation(scanner);
                    break;
                case 9:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void squareRootOperation(Scanner scanner) {
        System.out.print("Enter the number (x): ");
        double x = scanner.nextDouble();
        double result = Math.sqrt(x);
        System.out.println("Square Root of " + x + " is: " + result);
    }

    private static void factorialOperation(Scanner scanner) {
        System.out.print("Enter the number (x): ");
        int x = scanner.nextInt();
        long result = calculateFactorial(x);
        System.out.println("Factorial of " + x + " is: " + result);
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    private static void naturalLogarithmOperation(Scanner scanner) {
        System.out.print("Enter the number (x): ");
        double x = scanner.nextDouble();
        double result = Math.log(x);
        System.out.println("Natural Logarithm of " + x + " is: " + result);
    }

    private static void powerOperation(Scanner scanner) {
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (b): ");
        double b = scanner.nextDouble();
        double result = Math.pow(x, b);
        System.out.println(x + " raised to the power of " + b + " is: " + result);
    }

    private static void addition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = (num1 + num2);
        System.out.println("Result: " + result);
    }
    private static void subtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = (num1 - num2);
        System.out.println("Result: " + result);
    }
    private static void multiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = (num1 * num2);
        System.out.println("Result: " + result);
    }
    private static void division(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
            return;
        }
        System.out.println("Result: " + result);
    }

}
