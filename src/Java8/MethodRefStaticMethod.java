package Java8;

public class MethodRefStaticMethod {
    public static void main(String[] args) {
    MyInterface9 myInterface9 = MethodRefStaticMethod::msg;
    myInterface9.sample();
    }

    private static void msg(){
        System.out.println("In msg");
    }
}



interface MyInterface9{
    void sample();
}