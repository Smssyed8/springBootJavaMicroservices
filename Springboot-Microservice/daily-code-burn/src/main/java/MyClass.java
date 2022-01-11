package samplePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyClass {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		Map<String, String> map = new LinkedHashMap<>();
		
		/*map.put("Andhra", " Hyderabad");
		map.put("Telangana", " Hyderabad");
		Set<String> set = new HashSet<>();
		
		for(Map.Entry<String, String> mapVal: map.entrySet()) {
			
			if(!set.contains(mapVal.getValue())) {
				set.add(mapVal.getValue());
			} else {
				//System.out.println("key  " +   + " value " + mapVal.getValue() );
				System.out.println("key  " + mapVal.getKey()+ " value " + mapVal.getValue() );
				mapVal.
			}
		}*/
		
		
		String s = "0123ABC";
		s.matches("[0-9]");
		

	}

}
