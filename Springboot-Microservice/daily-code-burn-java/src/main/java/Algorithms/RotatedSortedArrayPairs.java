package Algorithms;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RotatedSortedArrayPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11, 15, 6, 8, 9, 10};
		int key = 16;
		
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < arr.length; i++) {
			
			if(set.contains(arr[i])) {
				System.out.println(arr[i]+ "," +(key - arr[i]));     // 
			}
			set.add(key - arr[i]); 
		}
		
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			// without using collection
			
			
		}
		
		
		//recursive method

	}

}
