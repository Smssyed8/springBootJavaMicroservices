package samplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * find K-complementary pairs in a given two arrays of integers.
example:
arr1 = [5, 2, 3, 0, 9, 6, 8]
arr2 = [7, 3, 1, 9, 0, 4, 2, 5]
target number = 10
pairs => (5, 5), (3, 7), (9, 1), (6, 4), (8, 2)
 * @author SSiddiqhi
 *
 */

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5, 2, 3, 0, 9, 6, 8};
		int[] arr2 = {7, 3, 1, 9, 0, 4, 2, 5};
		
		
	
		
		List<Integer> set = new ArrayList<Integer>();
	
		//System.out.println("array1");
		for(Integer a: arr1) {
			set.add(10 - a);//O(n);
		}
		//System.out.println("array2");
		for(Integer a: arr2) {//O[n]
			//System.out.print(a);
			if(set.contains(a)) {//O[1] //
				System.out.println(10-a+","+ a);
			}
			
		}
		
		//n+k = O[n]
		
		
	}

}
