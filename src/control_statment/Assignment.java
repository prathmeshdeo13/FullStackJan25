package control_statment;

//import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        //   int no=5;
        //   int fact=1;

        //   Scanner scanner =new Scanner(System.in);

        //  System.out.println("Enter the number:");
        //  no=scanner.nextInt();

        //  for (int i=1;i<=5;i++)
        // {

        //      fact=fact*i;

        //  }
        // System.out.println("Factorial of :"+no+" is"+fact);


        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j>=1; j--) {
                if (j>i)
                {
                    System.out.print("  ");
                } else {
                    System.out.print("  *");
                }
            }
            System.out.println();
        }
    }
}