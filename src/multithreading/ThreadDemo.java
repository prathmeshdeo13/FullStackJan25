package multithreading;



class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
           try{ Thread.sleep(500); }catch (InterruptedException e){ }
        }
    }

        }

class Bye extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Bye");
            try { Thread.sleep(500); } catch (InterruptedException e) { }

        }
    }

}



public class ThreadDemo {
    public static void main(String[] args) {
        Hello hello=new Hello();
        Bye bye=new Bye();
        hello.start();
        bye.start();
    }

}
