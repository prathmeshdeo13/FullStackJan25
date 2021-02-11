package multithreading;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue b = new LinkedBlockingQueue(2);
        Thread t1 = new Thread(new Producer1(b));
        Thread t2 = new Thread(new Consumer1(b));
        t1.start();
        t2.start();

    }
}

class Producer1 implements Runnable {

    BlockingQueue blockingQueue;

    public Producer1(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue ;
    }


    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("put: " + i);
            try {
                blockingQueue.put(i);
            } catch (Exception e) { }
        }  try { Thread.sleep(500); } catch (InterruptedException e) { }
    }
}

class Consumer1 implements Runnable{

    BlockingQueue blockingQueue;

    public Consumer1(BlockingQueue blockingQueue) {
        this.blockingQueue= blockingQueue;

    }

    @Override
    public void run(){
        while(true){
            try {
                System.out.println("take:"+blockingQueue.take());
                try { Thread.sleep(500); } catch (InterruptedException e) { }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


