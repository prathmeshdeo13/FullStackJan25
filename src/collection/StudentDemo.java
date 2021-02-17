package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;
    String Add;

    public Student(int id, String name, String add) {
        this.id = id;
        this.name = name;
        Add = add;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
//
//    @Override
//    public int compareTo(Student student) {
//        if(this.id==student.id) {
//            return 0;
//        } else if(this.id>student.id){
//            return 1;
//        } else {
//            return -1;
//        }
    }


public class StudentDemo{
    public static void main(String[] args) {



                Student s1 = new Student(4,"Shubham","Maharashtra");
                Student s2 = new Student(1,"Akshay","Dehli");
                Student s3 = new Student(2,"Hritik","Punjab");
                Student s4 = new Student(3,"Sushant","Chennai");

                List<Student> list = new ArrayList<>();
                list.add(s1);
                list.add(s2);
                list.add(s3);
                list.add(s4);

                Collections.sort(list);
                list.forEach(s->{
                    System.out.println(s.id+" "+s.name+" "+s.Add);
                });



            }

        }


