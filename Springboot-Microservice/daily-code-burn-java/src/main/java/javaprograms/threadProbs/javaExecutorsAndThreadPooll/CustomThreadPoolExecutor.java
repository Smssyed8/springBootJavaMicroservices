package javaprograms.threadProbs.javaExecutorsAndThreadPooll;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPoolExecutor {
 
	// for creating custom thread pool executor
	// 1. need blockingqueue which acts in fifo manner and is thread safe
	// 2. array of worker threads, worker class extend Thread, run tasks from queue
	// 3. addtask to queue method. put(runnable)
	// 4. Constructor of customerthread, which initilizes queue and array
	// 5. loops through array and initializes and starts worker thread, 
	public final BlockingQueue<Runnable> b;  
	public final Thread[] workerThreadsArray;
	
	public CustomThreadPoolExecutor(int numberOfThreads) {
		b = new LinkedBlockingQueue<>() ;
		workerThreadsArray = new Thread[numberOfThreads];
		int i = 0;
		for(Thread workThread: workerThreadsArray) {
			workThread = new Worker("Cutom pool thread"+ ++i);
			workThread.start();
		}
	}
	
	public void addTaskToQueue(Runnable s) {
		  try {
	            b.put(s);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
	class Worker extends Thread {
	
		String threadName;
		
		Worker(String threadName){
			super(threadName);
		}
		
		@Override
		public void run(){
			 while (true) {
	                try {
	                    b.take().run();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
		}
	}
}
