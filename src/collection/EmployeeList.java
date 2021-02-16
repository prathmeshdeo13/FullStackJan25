package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
    int id;
    String name;
    String add;

    public Employee(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
}
public class EmployeeList {
    public static void main(String[] args) {

        Employee e = new Employee(1,"Rahul","Pune");
        Employee e1 = new Employee(2,"Sachin","Nagpur");
        Employee e2 = new Employee(3,"Kabir","Solapur");

        List<Employee> list =new ArrayList<>();
        list.add(e);
        list.add(e1);
        list.add(e2);


        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.add);
        });
    }
}
