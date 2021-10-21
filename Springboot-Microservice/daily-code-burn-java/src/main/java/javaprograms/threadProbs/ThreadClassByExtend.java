package javaprograms.threadProbs;

public class ThreadClassByExtend extends Thread{

	int n;
	int x = 0;
	
	public ThreadClassByExtend(int n) {
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
