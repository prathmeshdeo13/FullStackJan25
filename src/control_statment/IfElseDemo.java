package control_statment;

public class IfElseDemo {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 1021;
        b = 1019;
        c = 1005;
        d = 0;

     // muliptiple condition //

        if (a > b && a > c && a > d) {
            System.out.println("a is biggest number");
        } else if (b > c && b > d) {
            System.out.println("b is biggest number");
        } else if (c > d) {
            System.out.println("c is biggest number");
        } else {
            System.out.println("d is biggest number");
        }

     // single condition //
        int i = 10;
        if (i > 0) {
            System.out.println("i is positive");
        } else {
            System.out.println("i is negative");
        }

    int age =19;
    String nationality ="Cannadian";
    if(age>18) {
        if(nationality == "India") {
            System.out.println("You can vote");
        }else {
            System.out.println("Not Indian");
          }
        }else {
            System.out.println("You can not vote");
        }

    // ternary operator //
    int s= i==10?100:1;
    System.out.println(s);





    }
}






