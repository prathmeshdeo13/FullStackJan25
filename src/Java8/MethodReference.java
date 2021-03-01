package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(12, 55, 88, 656, 1478);
//        list.forEach(System.out::println);



        MethodReference methodReference = new MethodReference();
        MyInterface3 myInterface3 = methodReference::display;
        System.out.println(myInterface3.msg());
    }


    private String display() {
        return "Bonjour";
    }
}


@FunctionalInterface
interface MyInterface3{

    String  msg();


}