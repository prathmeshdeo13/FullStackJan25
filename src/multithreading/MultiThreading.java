package multithreading;

public class MultiThreading extends Thread{

    public void run(){
        System.out.println("In run method");
    }


    public static void main(String[] args) {
        MultiThreading multiThreading =new MultiThreading();
        multiThreading.start();
    }
}
