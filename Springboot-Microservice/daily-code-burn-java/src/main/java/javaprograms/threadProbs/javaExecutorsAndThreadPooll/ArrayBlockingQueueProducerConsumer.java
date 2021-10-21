package javaprograms.threadProbs.javaExecutorsAndThreadPooll;
//https://www.geeksforgeeks.org/producer-consumer-solution-using-blockingqueue-in-java-thread/#:~:text=If%20a%20producer%20thread%20tries,a%20producer%20adds%20an%20element.
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Create a Main class for execution
public class ArrayBlockingQueueProducerConsumer {
 public static void main(String[] args)
 {

     // Create an ArrayBlockingQueue object with capacity
     // 4
     BlockingQueue<Integer> bqueue = new ArrayBlockingQueue<Integer>(4);

     // Create 1 object each for producer
     // and consumer and pass them the common
     // buffer created above
    // Producer p1 = new Producer(bqueue);
     //Consumer c1 = new Consumer(bqueue);

     // Create 1 thread each for producer
     // and consumer and pass them their
     // respective objects.
     Thread pThread = new Thread(new Producer(bqueue));
     Thread cThread = new Thread(new Consumer(bqueue));

     // Start both threads
     pThread.start();
     cThread.start();
 }
}

class Producer implements Runnable {

 BlockingQueue<Integer> obj;

 public Producer(BlockingQueue<Integer> obj)
 {
     this.obj = obj;
 }

 @Override public void run()
 {
     for (int i = 1; i <= 4; i++) {
         try {
             obj.put(i);
             System.out.println("Produced " + i);
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

class Consumer implements Runnable {

 BlockingQueue<Integer> obj;

 int taken = -1;

 public Consumer(BlockingQueue<Integer> obj)
 {
     this.obj = obj;
 }

 @Override public void run()
 {
     while (taken != 4) {
         try {
             taken = obj.take();
             System.out.println("Consumed " + taken);
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}