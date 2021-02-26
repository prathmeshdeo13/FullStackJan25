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


        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.forEach(consumer1);

        // if we want to multiply each value by 2
//        Consumer<Integer>  consumer = (Integer i)->{
//            System.out.println(i*2);
//        };
//
//        list.forEach(s->{
//            System.out.println(s*2);
//        });

        MyInterface myInterface = ()->{
                return "Hii";
    };
        System.out.println(myInterface.show());



//
//
//        MyInterface myInterface1 = ()-> System.out.println("In show method");
//        myInterface1.show();

        MyInterface1 myInterface1 = (i, j) ->{
                return i+j;
            };
        System.out.println(myInterface1.add(45,50));
        }
    }

