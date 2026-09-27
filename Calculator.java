package Calculator;

import java.util.Scanner;

public class Calculator {

    // Modular arithmetic methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static String divide(double a, double b) {
        if (b == 0) {
            return "Error: Division by zero";
        }
        return String.valueOf(a / b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple CLI Calculator ===");
        System.out.println("Operations: + (Add), - (Subtract), * (Multiply), / (Divide), q (Quit)");

        while (true) {
            System.out.print("\nEnter operation (+,-,*,/,q): ");
            String choice = scanner.next();

            if (choice.equals("q")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    break;
                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
            }
        }

        scanner.close();
    }
}

