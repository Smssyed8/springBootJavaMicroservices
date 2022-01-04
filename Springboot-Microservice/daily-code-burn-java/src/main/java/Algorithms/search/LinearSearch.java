package Algorithms.search;

public class LinearSearch {

	public static int linerSearch(int key, int[] array) {
		
		for(int i = 0; i < array.length; i++){ // N+1 comparisons
		    if(array[i] == key) // N comparisons
		    	return i; // I found the position of the element requested 
		}
		return -1;
	}
}
