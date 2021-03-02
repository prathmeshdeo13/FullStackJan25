package polymorphism;

public class PolyDemo {
// Sequence of arguments
    public void show(int a,String b){
        System.out.println("In show method1");
    }

    public void show(String a,int b){
        System.out.println("In show method2");
    }

    public void show (String a,int b,float c){
        System.out.println("In show method3");
    }
    public static void main(String[] args) {
        PolyDemo polyDemo = new PolyDemo();
        polyDemo.show("Prathamesh",12,5.2f);
        polyDemo.show(06,"Rohan Dada");
        polyDemo.show("Vishal Dada",25);
       PolyDemo1 polyDemo1 = new PolyDemo1();
       polyDemo1.show(10);
        polyDemo1.show("Akshay");
    }
}
// Type of arguments
class PolyDemo1 {
    public void show(int a) {
        System.out.println("In show method4");
    }

    public void show(String a) {
        System.out.println("In show method5");
    }
}
