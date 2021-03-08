package test;

import java.util.ArrayList;
import java.util.List;

//5th program
public class EmployeeTest {
    int empId;
    String empName;
    String empAdd;
    String Salary;

    public EmployeeTest(int empId, String empName, String empAdd, String salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.Salary = salary;
    }
}
    class Employee {
        public static void main(String[] args) {
            EmployeeTest employeeTest = new EmployeeTest(1,"Rahul","Pune","25000.00");
            EmployeeTest employeeTest1 =new EmployeeTest(2,"Aditya","Nashik","26000.00");
            EmployeeTest employeeTest2 =new EmployeeTest(3,"Shubham","Sangli","29000.00");
            EmployeeTest employeeTest3 =new EmployeeTest(4,"Aarav","Mumbai","31000.00");

            List<EmployeeTest> list = new ArrayList<>();
            list.add(employeeTest);
            list.add(employeeTest1);
            list.add(employeeTest2);
            list.add(employeeTest3);

            list.forEach(s->
                    System.out.println(s.empId+"  "+s.empName+"  "+s.empAdd+"  "+s.Salary+"  ")
                    );
        }
}