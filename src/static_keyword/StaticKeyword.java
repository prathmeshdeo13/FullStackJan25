package static_keyword;

public class StaticKeyword {
    static String CompanyName="Cognizant";
    int empId;
    String empName;

    public StaticKeyword(int empId, String empName) {
        this.empId = empId;
       this.empName = empName;
    }

    public static void display(){
        System.out.println("In static method");
    }


    public static void main(String[] args) {


        StaticKeyword staticKeyword = new StaticKeyword(1,"Rahul");
        StaticKeyword staticKeyword1 = new StaticKeyword(2,"Rohan");
        StaticKeyword staticKeyword2 = new StaticKeyword(3,"Rohit");
        StaticKeyword staticKeyword3 = new StaticKeyword(4,"Raj");

        staticKeyword.show();
        staticKeyword1.show();
        staticKeyword2.show();
        staticKeyword3.show();

        display();

    }
    public void show(){
        System.out.println("id=>"+ empId +" Name=>" +empName+ " Company->"+CompanyName);
    }
}
