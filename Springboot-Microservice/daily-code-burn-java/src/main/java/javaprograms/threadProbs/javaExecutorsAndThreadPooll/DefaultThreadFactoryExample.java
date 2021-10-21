package javaprograms.threadProbs.javaExecutorsAndThreadPooll;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class DefaultThreadFactoryExample {
    public static void main(String[] args)
    {
 
        for (int i = 1; i < 10; i++) {
 
            // Default ThreadFactory
            ThreadFactory threadFactory
                = Executors.defaultThreadFactory();
 
            // Creating new threads with the default
            // ThreadFactory
            Thread thread
                = threadFactory.newThread(new Command(i));
 
            // print the thread name
            System.out.println(
                "Name given by threadFactory = "
                + thread.getName());
 
            // start the thread
            thread.start();
        }
    }
}
 
class Command implements Runnable {
	
	int i;
	
	public Command(int iv) {
		// TODO Auto-generated constructor stub
		i = iv;
	}
    @Override public void run()
    {
       System.out.println(i);
    }
}