package multithreading;






    public class ThreadLambda {

        public static void main(String[] args) {
            Thread t1 = new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println("HelloWorld");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) { }
            }
        });

            Thread t2 = new Thread(()-> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("ByeBye");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e2) {
                }
            }
            });


                    t1.start();
                    t2.start();
                }
            }



