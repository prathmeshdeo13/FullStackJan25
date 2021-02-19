package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        List<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);

        List<Integer> list4 =new ArrayList<>();
        list4.add(6);
        list4.add(7);
        list4.add(8);
        list4.add(9);
        list4.add(10);

        list3.addAll(list4);
        System.out.println(list3);
        list3.set(1,12);
        System.out.println(list3);

        String s="Today";
        String s1="Wednesday";

        s.hashCode();
        s1.hashCode();


        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.equals(s1));

    }
}
