package assignment;


import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        int marks;
        int total=0;
        int average;


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of 6 subjects: ");

        for (int i=0;i<6;i++){
            marks=s.nextInt();
            total=total+marks;
        }

        average=total/6;

        System.out.println("Total of 6 subjects: "+total);
        System.out.println(("Average of 6 subjects: "+average));
    }
}


