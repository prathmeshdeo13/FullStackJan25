package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2,6,4,8,3,5,7);
        list.stream()
              .sorted()//Ascending order
             .sorted(Collections.reverseOrder()) // Descending order
             .forEach(System.out::println);


        Employee obj1 = new Employee(11,"Neha",50000.00);
        Employee obj2 = new Employee(13,"Vishal",35000.00);
        Employee obj3 = new Employee(12,"Gauri",65000.00);

        List<Employee> list1 = Arrays.asList(obj1,obj2,obj3);
        list1.stream()
             .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
              .forEach(System.out::println);
    }
}

class Employee{
    int id;
    String name;
    Double Salary;

    public Employee(int id, String name, Double Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}