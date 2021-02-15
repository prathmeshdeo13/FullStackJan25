package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"String 11");
        map.put(2,"String 12");
        map.put(3,"String 13");
        map.put(4,"String 14");
        map.put(5,"String 15");


        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }


        map.forEach((k,v)-> {
            System.out.println(k+"  "+v);
        });
    }
}
