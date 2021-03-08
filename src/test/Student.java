package test;
// 4th program
public class Student {
    int rollno;
    int ContactNo;
    int TotalMarks;
    String Name;


    public Student(int rollno, int contactNo, String name, int totalMarks) {
        this.rollno = rollno;
        this.ContactNo = contactNo;
        this.Name = name;
        this.TotalMarks = totalMarks;
    }

    public void display(){
        System.out.println("rollno=>" +  rollno  + " ContactNo=>" + ContactNo  + " Name=>"+ Name+ " TotalMarks=>"+ TotalMarks);
    }
}

class StudentDemo{
    public static void main(String[] args) {
       Student student = new Student(01,96233,"Rahul",376);
        Student student1 = new Student(07,95618,"Akshay",345);
        Student student2 = new Student(11,92681,"Mahesh",259);
        Student student3 = new Student(14,98912,"Vishal",476);

        student.display();
        student1.display();
        student2.display();
        student3.display();



    }
}




