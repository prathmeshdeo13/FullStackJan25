package assignment;

import java.util.Scanner;

public class Assignment7 {


        public static void main(String[] args) {
            int no = 5;
            int fact = 1;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number:");
            no = scanner.nextInt();

            for (int i = 1; i <= 5; i++) {

                fact = fact * i;

            }
            System.out.println("Factorial of :" + no + " is" + fact);
        }
    }



