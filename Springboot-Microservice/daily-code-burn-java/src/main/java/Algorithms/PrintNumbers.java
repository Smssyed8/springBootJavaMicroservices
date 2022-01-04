package Algorithms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintNumbers implements Comparable<Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a function to print 1-100, without using any number in the code.
		
		/*
		 * Given a list of non-negative integers, arrange them such that they form the largest number.
			Input: [10,2]
			Output: "210"
		 */
		int[] arr = {1788, 100, 50, 2, 5}; //1052 // 5102 // 5210   // 521788 // 55021788100
		
		//Arrays.so
		List<Integer> list = new ArrayList<>();
		Collections.sort(list);
		int prev = 0;
		String num = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 10) {
				
			}
			
			if(prev < arr[i]) {
				num = String.valueOf(prev) + arr[i];
				prev = arr[i];
				
			}
		}
		/*
		 * for() {
		 * 
		 * }
		 */
		
	}


	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
