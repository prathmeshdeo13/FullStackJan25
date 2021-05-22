package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        Student obj1 = new Student(1,"Rakesh",34);
        Student obj2 = new Student(2,"Nitin",89);
        Student obj3= new Student(3,"Yash",91);

        List<Student> list = Arrays.asList(obj1,obj2,obj3);
        list.stream()
             .filter(f->f.marks==34)
             .map(m-> m.marks+1)
              .collect(Collectors.toList())
              .forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list1.stream().map(m->m+2).forEach(System.out::println);


    }
}

class Student{

    Integer id;
    String name;
    Integer marks;


    public Student(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

