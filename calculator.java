import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Simple Calculator");

        while (continueCalculation) {
            System.out.print("Enter the first number: ");
            double num1 = getValidNumber(scanner);

            System.out.print("Enter the second number: ");
            double num2 = getValidNumber(scanner);

            System.out.println("Select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int operation = getValidOperation(scanner);

            double result = performOperation(num1, num2, operation);
            displayResult (num1, num2, operation, result);

            continueCalculation = askToContinue(scanner);
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static int getValidOperation(Scanner scanner) {
        int operation;
        while (true) {
            if (scanner.hasNextInt()) {
                operation = scanner.nextInt();
                if (operation >= 1 && operation <= 4) {
                    return operation;
                }
            } else {
                scanner.next();
            }
            System.out.print("Invalid selection. Please enter a number between 1 and 4: ");
        }
    }

    private static double performOperation(double num1, double num2, int operation) {
        switch (operation) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }    
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    private static void displayResult(double num1, double num2, int operation, double result) {
        String operationSymbol;
        switch (operation) {
            case 1:
                operationSymbol = "+";
            case 2:
                operationSymbol = "-";
            case 3:
                operationSymbol = "*";
            case 4:
                operationSymbol = "/";
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        System.out.println("Result: " + num1 + " " + operationSymbol + " " + num2 + " = " + result);
    }

    private static boolean askToContinue(Scanner scanner) {
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        while(true) {
            String response = scanner.next().trim().toLowerCase();
            if (response.equals("yes")) {
                return true;
            } else if (response.equals("no")) {
                return false;
            } else {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
            }
        }
    }
}