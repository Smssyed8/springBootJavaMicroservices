package javaprograms.threadProbs;

public class ThreadClassByRunnable implements Runnable{

	int n;
	int x = 0;
	
	public ThreadClassByRunnable(int n) {
		this.n = n;
	}
	
	@Override
	public void run(){
		synchronized(this){
			for(int i = 0; i < n; i++) {
				x = x +1;
			}
			this.notify();
		}
	}
}
