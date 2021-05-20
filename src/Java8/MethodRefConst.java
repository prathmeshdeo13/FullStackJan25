package Java8;

public class MethodRefConst {
    public static void main(String[] args) {
    MyInterface10 myInterface10 =Hello::new;
    myInterface10.hello();
    }
}

class Hello{
    public  Hello(){
        System.out.println("In Const");
    }
}


@FunctionalInterface
interface MyInterface10{
    Hello hello();
}
