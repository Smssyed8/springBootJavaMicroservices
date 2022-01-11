package samplePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayOfPair {

	
	public static void main(String[] args) {
		int[]  arr = {2, 2, -2, 1, 3, 1, -3};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int count = 1;
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			if(!set.contains(arr[i])) {
				int val = arr[i] * -1;
				if(set.contains(val)) {
					map.put(arr[i], val);
				}
				set.add(arr[i]);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> lMap: map.entrySet()) {
			System.out.println(lMap.getKey() +" "+lMap.getValue());
			
			
		}
	}
}
