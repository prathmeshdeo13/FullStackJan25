package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorDemo{
    int id;
    String name;
    String add;

    public ComparatorDemo(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }


}
class MainComparatorDemo {
    public static void main(String[] args) {

        ComparatorDemo e = new ComparatorDemo(3,"Rahul","Pune");
        ComparatorDemo e1 =new ComparatorDemo(1,"Sachin","Nagpur");
        ComparatorDemo e2 = new ComparatorDemo(2 ,"Kabir","Solapur");

        List<ComparatorDemo> list =new ArrayList<>();
        list.add(e);
        list.add(e1);
        list.add(e2);

        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if (o1.id > o2.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(list,comparator);
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.add);
        });
    }
}
