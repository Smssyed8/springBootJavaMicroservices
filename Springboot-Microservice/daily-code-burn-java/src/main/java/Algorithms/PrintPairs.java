package Algorithms;
import java.util.HashMap;
import java.util.Map;

public class PrintPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 4, 3, 5,6};
		int val = 6;
		
		Map<Integer, Integer> map = new HashMap<>();
		// cities Bang, delhi, chennai, mumbai, hyderabad
		// connectivity between cities
		// Tree - Map<String, Set<String>>  -> 'delhi' , {Bang, Chennai, mumbai}
		
		//graph //nodes
		
		for(int i = 0; i < arr.length; i++) {
			
			/*if() {
				
			}*/
			int dif = val - arr[i];
			//map.put(dif, );
		}

	}

}
