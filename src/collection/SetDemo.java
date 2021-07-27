package collection;

import java.util.*;
import java.util.ArrayList;

public class  SetDemo {

    public static void main(String[] args) {

        //Set doesn't store duplicate element
        // Set doesn't maintain insertion order

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(18);
        set.add(12);
        set.add(16);

        System.out.println(set);

        Set<Integer> LinkedList = new HashSet<>();
        LinkedList.add(21);
        LinkedList.add(22);
        LinkedList.add(23);
        LinkedList.add(24);
        LinkedList.add(25);

        System.out.println("linked Hashset->"+LinkedList);



        //Map doesn't contains duplicate keys,
        // but it stores Duplicate values


        Map<Integer,Integer> map =new HashMap<>();
        map.put(12,13);
        map.put(14,15);
        map.put(16,17);
        map.put(18,19);

        System.out.println(map);

        System.out.println(map.get(14));


        //Arraylist maintain insertion order
        //Arraylist can store duplicate elements

        List<Integer>  list = new ArrayList<>();
        list.add(60);
        list.add(50);
        list.add(45);
        list.add(53);
        list.add(63);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s);
        });




    }
}
