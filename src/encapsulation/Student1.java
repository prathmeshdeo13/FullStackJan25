package encapsulation;

public class Student1 {
    private int Studentid;
    private String Studentname;
    private String Studentadd;

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        this.Studentid = studentid;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        this.Studentname = studentname;
    }

    public String getStudentadd() {
        return Studentadd;
    }

    public void setStudentadd(String studentadd) {
       this.Studentadd = studentadd;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setStudentid(23);
        s1.setStudentname("Rohan");
        s1.setStudentadd("Pune");
        System.out.println(s1.getStudentid());
        System.out.println(s1.getStudentname());
        System.out.println(s1.getStudentadd());



    }
}


