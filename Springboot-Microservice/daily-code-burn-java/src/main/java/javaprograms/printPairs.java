package javaprograms;

public class printPairs {
	
	static String printPairs(int n) {
		
		if(n != 0) {
			n = -1;
			System.out.println("(");
			
		}
		
		String str = printPairs(n);
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		printPairs(n);
	}

}
