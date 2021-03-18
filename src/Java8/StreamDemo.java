package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {


    int id;
    String name;
    String address;
    int salary;


    public StreamDemo(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StreamDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo(1,"Vaibhav","Kolapur",50000);
        StreamDemo streamDemo1 = new StreamDemo(2,"Yash","Pune",49000);
        StreamDemo streamDemo2 = new StreamDemo(3,"Suchitra","Jalgoan",60000);
        StreamDemo streamDemo3= new StreamDemo(4,"Abhijeet","Mumbai",75000);

        List<StreamDemo> list = new ArrayList<>();
        list.add(streamDemo);
        list.add(streamDemo1);
        list.add(streamDemo2);
        list.add(streamDemo3);

        List<Integer> list1 = list.stream()
                                .map(m->m.salary*2)
                                .collect(Collectors.toList());

        System.out.println(list1);


        list.stream()
                .filter(f->f.salary>=50000)
                .collect(Collectors.toList())
                .forEach(System.out::println);



        list.stream()
                .filter(f->f.salary>=50000)
                .map(StreamDemo::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}
