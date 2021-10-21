package javaprograms.threadProbs;

public class ThreadMain {
	
    public static void main(String[] arg) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int timeInSec = 5000;
                try {
                    Thread.sleep(timeInSec);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("Thread ready");
            }
        });

        thread.start();
       
    }
}
