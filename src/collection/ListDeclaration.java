package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDeclaration {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        List<Integer> list1 =new ArrayList<>(Arrays.asList(1,12,54,147,1234));
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(List.of(1,12,58,56,898));
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>() {{
            add(91);
            add(96);
            add(100);
        }};
        System.out.println(list3);
     }
}
