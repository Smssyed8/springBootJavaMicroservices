package Algorithms;

import java.util.Arrays;

/**
 * An anagram is a type of word play, the result of rearranging the 
 * letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once.
For example "Torchwood" can be rearranged into "Doctor Who". Implement a method that checks 
whether two non-null starings are an anagram.
 * @author SSiddiqhi
 *
 */
//Syed
// dsyes

/*
 * convert char[] // remove spaces.
 * sort both   // edsy // edsy
 * check for total size if not true, return false
 * iterate(check arr[i] == arr2[i])
 * mismatch return false
 * return true
 * 
 */
public class Interview2 {

	public static void main(String[] args) {
		String s = "Torchwood";
		String s1 = "Doctor Who";
		s1 = s1.replace(" ", "");
		System.out.println(s1);
		char[] c1 = s.toLowerCase().toCharArray();
		char[] c2 = s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean anagram = true;
		if(c1.length != c2.length) {
			//System.out.println("not anagram");
			anagram = false;
			//return
		}
		
		for(int i = 0; i < c1.length; i++) {
			if(c1[i] == c2[i]) {
				continue;
			} else {
				anagram = false;
				break;
			}
		}
		
		if(anagram) {
			System.out.println("anagram");
		} else {
			System.out.println(" not anagram");
		}
		
		

	}

}
