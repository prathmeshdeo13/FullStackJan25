package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class HigherOrderFunction1 {
    public static void main(String[] args) {

        List<Integer> list = (List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filter1;

        filter1 = (lst, predicate) -> {
            List<Integer> result = new ArrayList<>();

            for (Integer i : lst) {
                if (predicate.test(i)) {
                    result.add(i);
                }
            }
            return result;
        };
        System.out.println(filter1.apply(list,x-> x%2!=0));


        int i=((BiFunction<String,String,Integer>)String::indexOf)
                .andThen(Integer::intValue)
                .apply("Shekhar","r");

        System.out.println(i);



        int o=((BiFunction<String,String,Integer>)String::indexOf)
                .andThen(Integer::intValue)
                .apply("Rakesh","s");
        System.out.println(o);
    }

}
