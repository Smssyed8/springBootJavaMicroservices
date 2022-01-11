package samplePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySample {

	
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 2, 1}; 
		
		Set<Integer> set = new HashSet<>();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		
		for(int i = 0; i < arr.length; i++) {
			/*if(!set.contains(arr[i])) {
				set.add(arr[i]);
			} */
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			} else {
				map.put(arr[i], 1);
			}
						
		}
		
		
		for(Map.Entry<Integer, Integer> lMap: map.entrySet()) {
			if(lMap.getValue() == 1) {
				System.out.println(lMap.getKey());
			}
		}
			
	}
}
