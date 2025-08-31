// CALCULATOR
import java.util.*;

public class P8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtra5ction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            case '%':
                System.out.println("Remainder: " + (a % b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}