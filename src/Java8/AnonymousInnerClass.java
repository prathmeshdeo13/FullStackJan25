package Java8;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Addition addition = new Addition() {
            @Override
            Integer add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(addition.add(15,45));
    }
}


abstract class Addition{

   abstract Integer add(int a,int b);
}