package Algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Altimetrik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 4, 6, 7};
		
		
		int k = 13;
		
		int n = arr.length -1;
		int prevEle = arr[0];
		int prevLast = arr[n];
		
		for(int i = 0; i < arr.length; i++) {
			//System.out.println( arr[i]);
			//int dif = k - arr[i];  //7-1 = 6
			//System.out.println(prevEle+ ","+ prevLast);
			if(arr[n - i] + arr[i] == k) {
				System.out.println(arr[i]+ ","+ arr[n-i]);
				continue;
			} else if(arr[i] + prevLast == k ){
				System.out.println(arr[i]+ ","+ prevLast);
				continue;
			} else if(arr[n - i] + prevEle == k ){
				System.out.println(arr[n - i]+ ","+ prevEle);
				continue;
			} 
			if(i > n/2) {
				//break;
			}
			prevEle = arr[i];
			prevLast = arr[n - i];
			
			
			
			/*
			 * if(map.get(arr[i]) != null && map.get(arr[i])) { System.out.println(dif +
			 * ", "+ arr[i]); continue; } map.put(dif, true);
			 */
		}
	}

}
