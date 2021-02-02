package Try_catch;
public class trycatchDemo {

    public static void main(String[] args) {
        try {
            int i = 20;
            int j = 0;
            int k = i / j;

            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Expection:" + e);
        }

                System.out.println("Hello");


        }
    }


