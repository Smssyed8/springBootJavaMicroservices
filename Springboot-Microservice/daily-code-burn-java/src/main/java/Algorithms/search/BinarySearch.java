package Algorithms.search;

public class BinarySearch {
	
	//recursive method
	public static int binarySearchSortedArray(int min, int max, int[] arr, int key) {
		
		if(max >= min) {
			int mid = min + (max - min )/2;
			if(arr[mid] == key) {
				return mid;
			}
			
			if(key > arr[mid]) {
				min = mid + 1;
				return binarySearchSortedArray(min, max, arr, key);
			} else if(key < arr[mid]) {
				max = mid - 1; 
				return binarySearchSortedArray(min, max, arr, key);
			}
		}
		
		return -1;
	}
	
	public static int binarySearchIterative(int max, int[] arr, int key) {

		//set stating and ending index
		int min = 0, ending = max-1;

		while(min <= ending) {
			// take mid of the list
			int mid = (min + max) / 2;

			// we found a match
			if(arr[mid] == key) {
				return mid; 
			}
			// go on right side
			else if(key > arr[mid]) {
				min = mid + 1; 
			}
			// go on left side
			else {
				max = mid - 1;
			}
		}
		// element is not present in list
		return -1;
	}
	
}
