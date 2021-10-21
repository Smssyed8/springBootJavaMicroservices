package javaprograms.threadProbs.javaCallableAndFutureExample;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		 System.out.println("Entered Callable");
         Thread.sleep(2000);
         return "Hello from CallableThread";
	}

}
