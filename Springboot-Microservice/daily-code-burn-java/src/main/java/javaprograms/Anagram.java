package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		String li = "triangle"; // est
		String si = "integral"; // 
		//si.
		int liLength = li.length();
		int siLength = si.length();
		
		String concatenated = li + si;
		
		System.out.println(concatenated);
		if(liLength != siLength) {
			System.out.println("not an anagram");
		}
		char[] charArr = li.toCharArray();
		int count = 0;
		Set<Character> set = new HashSet<>();
		boolean isAnag = true;
		System.out.println("liLength"+liLength);
		for(char c: charArr) {  //
			//System.out.println("count"+count);
			
			//if(count == liLength){
				//System.out.println("count == liLength");
				//System.out.println(count == liLength);
				/*
				 * if(set.contains(c)){ continue; } else { isAnag = false;
				 * System.out.println("not an anagram"); break; }
				 */
				if(si.indexOf(c) > -1) {
					continue;
				} else {
					 isAnag = false;
					 System.out.println("not an anagram");
					 break;
				}
			//} else {
			//  count++;
			  //System.out.println("c"+c);
			  //set.add(c);
			//}
		}
		
		if(isAnag) {
			System.out.println("anagram");
		}
		
		
	}
}
