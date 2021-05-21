package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class HigherOrderFunctionClassDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,12,13,14,15,16,17,18,19,20);

        BiFunction<List<Integer>, Predicate<Integer>,List<Integer>> filter;

        filter=(lst,predicate) ->    {
            List<Integer> res = new ArrayList<>();
            for (Integer i:lst) {
                if(predicate.test(i)){
                    res.add(i);
                }
            }
            return res;
        };
        System.out.println(filter.apply(list,x->x%2!=0));

    }
}
