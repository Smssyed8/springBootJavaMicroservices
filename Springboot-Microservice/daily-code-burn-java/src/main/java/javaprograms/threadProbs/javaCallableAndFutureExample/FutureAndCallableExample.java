package javaprograms.threadProbs.javaCallableAndFutureExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureAndCallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            // Perform some computation
	    System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };

        CallableThread call = new CallableThread();
        System.out.println("Submitting Callable");	
        Future<String> future = executorService.submit(callable);
        Future<String> future2 = executorService.submit(call);
        // This line executes immediately
        System.out.println("Do something else while callable is getting executed");

        System.out.println("Retrieve the result of the future");
        // Future.get() blocks until the result is available
        String result = future.get();// for any api call if api is down, it will stay in blocked
        // for lifetime, to avoid this, add timeout
        try {
			String result2 = future.get(1,TimeUnit.MILLISECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(result);

        executorService.shutdown();
    }
}
