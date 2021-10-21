package javaprograms.threadProbs.javaExecutorsAndThreadPooll;

// Java program to illustrate
// ThreadPool
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Task class to be executed (Step 1)
class ExecutorExampleTask implements Runnable {
    private String name;

    public ExecutorExampleTask(String s) {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for" +
                            " task name - " + name + " = " + ft.format(d));
                    //prints the initialization time for every task
                } else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " +
                            name + " = " + ft.format(d));
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Test {
        // Maximum number of threads in thread pool
        static final int MAX_T = 3;

        public static void main(String[] args) {
            // creates five tasks
            Runnable r1 = new ExecutorExampleTask("task 1");
            Runnable r2 = new ExecutorExampleTask("task 2");
            Runnable r3 = new ExecutorExampleTask("task 3");
            Runnable r4 = new ExecutorExampleTask("task 4");
            Runnable r5 = new ExecutorExampleTask("task 5");

            // creates a thread pool with MAX_T no. of
            // threads as the fixed pool size(Step 2)
            ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

            // passes the Task objects to the pool to execute (Step 3)
            pool.execute(r1);
            pool.execute(r2);
           
            
			/*
			 * Future<?> future = pool.submit( r3);
			 * 
			 * if(future.isDone() && !future.isCancelled()) { try {
			 * System.out.println(future.get()); } catch (InterruptedException |
			 * ExecutionException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } }
			 */
            //pool.execute(r4);
           // pool.execute(r5);
            // pool shutdown ( Step 4)
            //pool.shutdown();
            
            //https://www.javacodemonk.com/implement-custom-thread-pool-in-java-without-executor-framework-ca10e61d
            CustomThreadPoolExecutor customePool = new CustomThreadPoolExecutor(5);
            customePool.addTaskToQueue(() -> System.out.println("First print task"));
            customePool.addTaskToQueue(() -> System.out.println("secod print task"));
            pool.execute(r3);
            customePool.addTaskToQueue(r3);
           
        }
    }
}

