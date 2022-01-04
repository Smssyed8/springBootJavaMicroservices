package Algorithms;
import java.util.HashMap;
import java.util.Map;

public class AnagramClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "caab";
		String s1 = "cabb";
		
		if(s.length() != s1.length()) {
			System.out.println("Not anagram");
			return;
		}
		
		Map<Character, Integer> sMap = new HashMap<>();
		
		Map<Character, Integer> s1Map = new HashMap<>();
		mapper(sMap,s);
		mapper(s1Map,s1);
		System.out.println(sMap);
		System.out.println(s1Map);
		if(sMap.equals(s1Map)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}
	
	private static void  mapper(Map<Character, Integer> mapV, String s){
		char[] c = s.toCharArray();
		int count = 1;
		for(int i = 0; i < c.length; i++) {
			
			if(mapV.get(c[i]) != null) {
				System.out.println(mapV.get(c[i]) != null);
				int l = mapV.get(c[i]);
				
				l = l+1;
				System.out.println("l"+l);
				mapV.put(c[i], l);
				continue;
			}
			mapV.put(c[i],count);
		}
	}
	
	/*
	 * public ListNode findCycle(ListNode head) {
	 * 
	 * Node temp = head; while(temp.next() != head) { temp = temp.next(); } //1 -> 2
	 * -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 5 | | // slow and fast pointers //8 -> 7 }
	 */

}
