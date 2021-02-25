package Java8;


import collection.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface{
    String show();
}


interface MyInterface1{
    int add(int i,int j);
}

public class LambdaExpression {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,23,45,787);

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        list.forEach(consumer);

        MyInterface myInterface = ()->{
                return "Hii";
    };
        System.out.println(myInterface.show());




//
//        MyInterface myInterface1 = ()-> System.out.println("In show method");
//        myInterface1.show();

        MyInterface1 myInterface1 = (i, j) ->{
                return i+j;
            };
        System.out.println(myInterface1.add(45,50));
        }
    }

