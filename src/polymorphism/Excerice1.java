package polymorphism;

public class Excerice1 {

    public void show(int a,String b,float c) {
        System.out.println("In show method1");
    }
}

    class Test extends Excerice1{
        @Override
        public void show(int a,String b,float c) {
            System.out.println("In show method2");
        }

        public static void main(String[] args) {
         Excerice1 excerice1 = new Excerice1();
         excerice1.show(14,"Mahesh",25.3f);

         Test test = new Test();
         test.show(25,"Mrunal",36.5f);
        }
}