package control_statment;

import java.util.Scanner;

public class Whileloop {

    public static void main(String[] args) {
        int num;
        int guess;
        int trial = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the guess number:");

        num = (int) (Math.random() * 100);

        do {
            System.out.println("Enter the number:");
            guess = scanner.nextInt();
            trial++;
            if (guess < num) {
                System.out.println("too low");
            } else if (guess > num) {
                System.out.println("too high");
            } else {
                System.out.println("Guess is correct after trail"+trial);
            }
        } while (guess != num) ;


    }
}

