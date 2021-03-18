package control_statment;

public class DesignProgram {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=2 && j>=2 && i<=4 && j<=4){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        for(int a=1;a<=5;a++){
            for(int b=1;b<=a;b++){
                System.out.print(b);
            }
            System.out.println();
        }


    }
}
