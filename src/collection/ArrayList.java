package collection;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Enhanced loop
        for (int i : list) {
            System.out.println(i);
        }

        // traditional loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //forEach Lambda Expression
        list.forEach((s) -> {
            System.out.println(s);
        });


        // Method reference
        list.forEach(System.out::println);


        int arr[] = new int[5];

        arr[0] = 12;
        arr[1] = 13;
        arr[2] = 14;
        arr[3] = 15;
        arr[4] = 16;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
