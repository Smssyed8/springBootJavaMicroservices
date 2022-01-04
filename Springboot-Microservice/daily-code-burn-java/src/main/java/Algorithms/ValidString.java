package Algorithms;

public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boolean finalFlag = true;
		boolean upper = true;
		boolean lower = true;
		boolean firstCap = true;
		// All caps
		//All low
		//first Caps
		String s = "Syed";
		char[] cArr = s.toCharArray();
		for(int i = 0; i < cArr.length; i++) {
			Character c = cArr[i];
			boolean f = c.isUpperCase(c);
			if(i == 0 && f) {
				lower = false;
				continue;
			} else if(i == 0) {
				upper = false;
				firstCap = false;
			} else {
				boolean l = c.isLowerCase(c);
				if(!l) {
					firstCap = false;
					lower = false;
					continue;
				} 
			}
			//System.out.println(cArr[i] + ", "+f);
		}
		//System.out.println(upper);
		//System.out.println(lower);
		System.out.println(firstCap);
	}


}
