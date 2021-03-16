package control_statment;

import java.util.Scanner;

public class DesignPatternProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int k=sc.nextInt();

        if(k<=10){
        for(int i=1;i<=k;i++){
            for(int s=0;s<(k-i);s++) {
                System.out.print(" ");
            }
                for (int j=0;j<(i*2-1);j++){
                    System.out.print("*");
                }
            System.out.println();
            }
            } else{
            System.out.println("Rows should be less than 10");
        }
        }
    }

