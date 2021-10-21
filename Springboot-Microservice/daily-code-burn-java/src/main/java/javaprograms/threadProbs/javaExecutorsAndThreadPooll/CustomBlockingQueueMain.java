package javaprograms.threadProbs.javaExecutorsAndThreadPooll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomBlockingQueueMain {
	 
    public static void main(String[] args) {
        CustomBlockingQueue customBlockingQueue = new CustomBlockingQueue();
        // Creating producer and consumer threads
        Thread producer = new Thread(new Producers(customBlockingQueue));
        Thread consumer = new Thread(new Consumers(customBlockingQueue)); 
 
        producer.start();
        consumer.start();
        
        
        BlockingQueue<Integer> block = new ArrayBlockingQueue<>(5);
        Thread myProducer = new Thread(new MyProducer(block));
        Thread myConsumer = new Thread(() -> {
        	for(int i = 0; i < 10; i++) {
        		try {
					System.out.println("Myblock consumer" + block.take());
        			
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        });
        
        myProducer.start();
        myConsumer.start();
    }
}
 
class Producers implements Runnable {
 
    private CustomBlockingQueue customBlockingQueue;
 
    public Producers(CustomBlockingQueue customBlockingQueue){
        this.customBlockingQueue = customBlockingQueue;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                customBlockingQueue.put(i);                            
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
}
 
class Consumers implements Runnable {
    private CustomBlockingQueue customBlockingQueue;
 
    public Consumers(CustomBlockingQueue customBlockingQueue){
        this.customBlockingQueue = customBlockingQueue;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                customBlockingQueue.take();               
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
}

class MyProducer implements Runnable {
	
	private BlockingQueue<Integer> block;
	public MyProducer(BlockingQueue<Integer> myBlock) {
		// TODO Auto-generated constructor stub
		block = myBlock;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				block.put(i);
				System.out.println("Myblock producer"+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

