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



    }
}
