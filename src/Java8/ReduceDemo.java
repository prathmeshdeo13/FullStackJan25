package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = 0;
        for (Integer i:list) {
            sum=sum+i;

        }
        System.out.println(sum);

        Optional<Integer> i=list.stream().reduce((r1,r2)->r1+r2);
        System.out.println(i.get());


        List<String> Strings =Arrays.asList("java","programming","is","best");

        Optional<String> Str=Strings.stream().reduce((r1,r2)->r1.length()>r2.length() ? r1:r2);
        System.out.println(Str.get());
    }
}
