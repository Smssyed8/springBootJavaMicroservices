package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class AppviewX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbbcca";
		char[] chArr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> seqMap = new HashMap<>();
		int count = 1;
		Character c = chArr[0];
		for(int i = 0; i< chArr.length; i++ ) {
			//count = 1;
			
			if(map.containsKey(chArr[i]) && chArr[i] == c) {
				System.out.println(chArr[i]);
				int lc = map.get(chArr[i]);
				lc++;
				map.put(chArr[i], lc);
				c = chArr[i];
				continue;
			} /*
				 * else if() {
				 * 
				 * }
				 */
			map.put(chArr[i], count);
			c = chArr[i];
		}
		
		for(Map.Entry<Character, Integer> lMap: map.entrySet()) {
			System.out.println(lMap.getKey() + "," +lMap.getValue());
			
		}
	}

}
