package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String add;

    public Employee(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

  /*  @Override
    public int compareTo(Employee employee) {
        if (this.id == employee.id) {
            return 0;
         }else if(this.id>employee.id){
            return 1;
        } else {
            return -1;
        }
    } */



}
public class EmployeeList {
    public static void main(String[] args) {

        Employee e = new Employee(3,"Rahul","Pune");
        Employee e1 = new Employee(1,"Sachin","Nagpur");
        Employee e2 = new Employee(2 ,"Kabir","Solapur");

        List<Employee> list =new ArrayList<>();
        list.add(e);
        list.add(e1);
        list.add(e2);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.add);
        });
    }
}
