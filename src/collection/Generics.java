package collection;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        show(list);


        List<String> strings = new ArrayList<>();
        strings.add("Rucha");
        strings.add("Harshada");
        strings.add("Sejal");
        strings.add("Gauri");
        strings.add("Neha");
        show(strings);
    }


        private static void show(List<?> list){

            list.forEach(s-> {
                System.out.println(s);
            });
        }





}
