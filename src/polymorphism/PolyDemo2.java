package polymorphism;

public class PolyDemo2 {

    void show(int a, String b) {
        System.out.println("In show method2500");
    }

    void show(String a, int b) {
        System.out.println("In show method2600");
    }

    void show(String a,int b,float )

    public static void main(String[] args) {
        PolyDemo2 polyDemo2 = new PolyDemo2();
        // polyDemo2.show(12,"Madhuri");
        polyDemo2.show("Yogesh", 2900);
        polyDemo2.show(23, "Rietesh");
        PolyDemo3 polyDemo3 = new PolyDemo3();
        polyDemo3.show(26);
        polyDemo3.show("Shubham");
    }
}


        class PolyDemo3 {
            void show(int a) {
                System.out.println("In show method 23000");
            }

            void show(String b) {
                System.out.println("In show method 24000");
                }
            }
        }

