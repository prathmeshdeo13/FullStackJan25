package inhertiance;

public class practice1 {
    public static void main(String[] args) {
   Multiplication2 multiplication2 = new Multiplication2();
   multiplication2.a=(19);
   multiplication2.b=(25);
   multiplication2.sub();
   multiplication2.multi();

   multiplication2.sub();
        System.out.println("Subtraction=>"+multiplication2.c);

   multiplication2.multi();
        System.out.println("Multiplication=>"+multiplication2.c);
    }


}



class Addition2 {
    int a,b,c;

    public void add(){
        c=a+b;
    }
}

class Subtraction2 extends Addition2{

    public void sub(){
        c=a-b;
    }
}

class Multiplication2 extends Subtraction2{

    public void multi(){
        c=a*b;
    }
}
