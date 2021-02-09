package multithreading;

class MyRunnable extends Sample implements Runnable{

    public void run(){
        System.out.println("In Runnable run");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable =new MyRunnable();
        Thread t1=new Thread(myRunnable);
        t1.start();
    }

}
