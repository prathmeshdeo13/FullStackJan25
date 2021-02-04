package encapsulation;

public class Employee {

    private int employeeid;
    private String name;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setemployeeid(13);
        emp1.setname("Vishal");
            System.out.println(emp1.getemployeeid());
            System.out.println(emp1.getname());
    }

    public void setemployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getemployeeid(){
        return employeeid;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }

    }


