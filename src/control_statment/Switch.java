package control_statment;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Double num1, num2;
        char operator;
        Double output=0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second name");
        num2 = scanner.nextDouble();

        System.out.println("Enter + - / * ");
        operator = scanner.next().charAt(0);


        switch (operator) {
            case '+': output = num1 + num2;
            break;
            case '-': output = num1 - num2;
            break;
            case '/': output = num1 / num2;
            break;
            case '*': output = num1 * num2;
            break;
            default:
                System.out.println("Not matched");
        }
        System.out.println(num1+" "+operator+" "+num2+" ="+output);
    }
}










