package assignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number :");
        num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number is positive ");
        } else if (num < 0) {
            System.out.println("The number is negative ");
        } else {
            System.out.println("Its zero");
        }
    }
}
