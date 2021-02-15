package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Map2 {

    public static void main(String []args){

        List<Map<Integer,String>> list =new ArrayList<>();
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"String1");
        map.put(2,"String3");
        map.put(3,"String5");

        Map<Integer,String> map1 =new HashMap<>();
        map1.put(4,"String7");
        map1.put(5,"String9");
        map1.put(6,"String11");

        list.add(map);
        list.add(map1);

        list.forEach((s)->{
            s.forEach((k,v)-> {
                System.out.println(k + "  "  +  v);
            });
        });


    }

}
