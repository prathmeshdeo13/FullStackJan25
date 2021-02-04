package control_statment;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        i = scanner.nextInt();
        //for (int i = 0; i < num; i++) {
          //  System.out.println(2 * i + 1);


            if (i%2 == 0) {
                System.out.print(" Even number" + i);
            } else {
                System.out.println("Odd number" + i);
            }
        }
    }


