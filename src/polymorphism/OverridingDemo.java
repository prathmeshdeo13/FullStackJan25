package polymorphism;

 class OverridingDemo {
     //sequence arguments
    public void show(String a, int b) {
        System.out.println("In show method6");

    }
}



     class Test1 extends OverridingDemo{
         @Override
         public void show (String a, int b){
                 System.out.println("In show method7");
             }


         public static void main(String[] args) {
             OverridingDemo o = new OverridingDemo();
            o.show("Rucha", 18);

             Test1 test1 = new Test1();
             test1.show("Sejal", 26);

         }
     }

