package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 55, 88, 656, 1478);
        list.forEach(System.out::println);



        MethodReference methodReference = new MethodReference();
        MyInterface3 myInterface3 = methodReference::display;
        System.out.println(myInterface3.msg());

        BiFunction<Integer,Integer,Integer> addition =MyInterface4::add;

        int i=addition.apply(5,12);
        System.out.println(i);

        BiFunction<Integer,Integer,Integer> multiplication=MyInterface5::multi;

        int x=multiplication.apply(17,5);
        System.out.println(x);
    }


    private String display()  {
        return "Bonjour";
    }
}


@FunctionalInterface
interface MyInterface3{
    String  msg();
}


interface MyInterface4 {

    public static int add(int i, int j) {
        return i + j;
    }
}

interface MyInterface5{
        public static int multi(int a , int b){
            return a*b;
        }
}
