
import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a+b;
            case "subtract":
                return a-b;
            case "multiply":
                return a*b;
            case "divide":
                if (b!= 0) return a/b;
                else {
                    System.out.println("Cannot Division by zero");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = s.nextDouble();

        System.out.print("Enter second number: ");
        double b = s.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = s.next();

        Calculator calc = new Calculator(a, b, op);
        System.out.println("Result: " + calc.calculate());
    }
}
