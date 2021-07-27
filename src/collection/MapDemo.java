package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("String 11",21);
        map.put("String 12",22);
        map.put("String 13",23);
        map.put("String 14",24);
        map.put("String 15",25);


        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }


        map.forEach((k,v)-> {
            System.out.println(k+"  "+v);
        });
    }
}
