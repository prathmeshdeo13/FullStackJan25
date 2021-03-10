package Java8;

public class AnonymousGenericsClass {
    public static void main(String[] args) {
        Multiplication<Integer> multiplication = new Multiplication<Integer>() {
            @Override
            Integer multi(Integer i, Integer j) {
                return i*j;
            }
        };
        System.out.println(multiplication.multi(17,5));

        }
}


abstract class Multiplication<T>{

    abstract T multi(T i,T j);

}
