package finalKeyword;

public class FinalKeyword {
    public static void main(String[] args) {

//        Final variable
//        final int i = 10;
////        i = i + 25;
//        System.out.println(i);

        A a = new B();
        a.show();
    }
}

//Final Method
final class A{ // final class can't extends

    final public void show(){  // Final method can not be override.
        System.out.println("In show method");
    }
}

class B extends A{
    public void show(){
        System.out.println("In show method");
    }
}



