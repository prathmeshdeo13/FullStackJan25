package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorDemo1{
    int id;
    String name;
    String Add;

    public ComparatorDemo1(int id, String name, String add) {
        this.id = id;
        this.name = name;
        Add = add;
    }
}
public class MainComparator1{

    public static void main(String[] args) {

        ComparatorDemo1 s1 = new ComparatorDemo1(4,"Shubham","Maharashtra");
        ComparatorDemo1 s2 = new ComparatorDemo1(1,"Akshay","Dehli");
        ComparatorDemo1 s3 = new ComparatorDemo1(2,"Hritik","Punjab");
        ComparatorDemo1 s4 = new ComparatorDemo1(3,"Sushant","Chennai");

        List<ComparatorDemo1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Comparator<ComparatorDemo1> comparator = new Comparator<ComparatorDemo1>() {
            @Override
            public int compare(ComparatorDemo1 o1, ComparatorDemo1 o2) {
                if(o1.id>o2.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };


        Collections.sort(list,comparator);
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.Add);
        });



    }

}

