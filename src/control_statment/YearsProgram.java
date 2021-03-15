package control_statment;

import java.util.Scanner;

public class YearsProgram {
    public static void main(String[] args) {
        int i=374;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        i = scanner.nextInt();

        System.out.println("Years=>"+i/365);
        System.out.println("Weeks=>"+(i%365)/7);
        System.out.println("Days=>"+(i%365)%7);
    }
}
