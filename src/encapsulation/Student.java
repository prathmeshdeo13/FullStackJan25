public class Student {
    private int rollno;
    private String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setrollno(25);
        s1.setname("Prathmesh");
        System.out.println(s1.getrollno());
        System.out.println(s1.getName());
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

    public int getrollno(){
        return rollno;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


