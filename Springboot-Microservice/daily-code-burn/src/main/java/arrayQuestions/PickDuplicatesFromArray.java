package arrayQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PickDuplicatesFromArray {
	

	static int n = 0;
	static int[] sortedArr = {1,2,3,4,5,6};
	static int[] unSortedArr = {1,3,2,5,4,6};
	static int[] duplicateSortedArr = {1,2,3,5,4,5,6};
	static int[] duplicateUnSortedArr = {1,3,5,2,5,4,6};
	
	static int key = 6;
	
	
	
	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		//int a = sc.nextInt();
		//System.out.println("Enter the value"+sortedArr);
		//System.out.println("equals method called"+a);
			printPairs(key,unSortedArr);
	}



	private static void printPairs(int key2, int[] unSortedArr2) {
		// TODO Auto-generated method stub
		 HashSet<Integer> s = new HashSet<Integer>();
	        for (int i = 0; i < unSortedArr2.length; ++i)
	        {
	        	//{1,3,2,5,4,6};
	            int temp = key2 - unSortedArr2[i];
	            System.out.println("temp value = "+temp+", array value = "+unSortedArr2[i]);
	            // checking for condition
	            if (s.contains(temp)) {
	                System.out.println(
	                    "Pair with given sum "
	                    + key2 + " is (" + unSortedArr2[i]
	                    + ", " + temp + ")");
	            }
	            s.add(unSortedArr2[i]);
	        }
		
	}
	
}
