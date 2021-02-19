package inhertiance;


class Addition1{   //base class
    int a,b,c;

    public void add(){
        c=a+b;

    }
}

// Hierachy Inheritance // Derived Class
class Subtraction1 extends Addition1{

    public void Sub(){
        c=a-b;

    }
}

class Multiplication1 extends Addition1{


    public void multi(){
        c=a*b;
    }
}
public class PraticeDemo {
    public static void main(String[] args) {
        Subtraction1 subtraction1 = new Subtraction1();
        Multiplication1 multiplication1 = new Multiplication1();
        subtraction1.a=(4);
        subtraction1.b=(2);
        subtraction1.Sub();
        multiplication1.a=(5);
        multiplication1.b=(4);
        multiplication1.multi();


        subtraction1.Sub();
        System.out.println("Subtraction ->"+subtraction1.c);


        multiplication1.multi();
        System.out.println("Multiplication->"+multiplication1.c);
    }
}
