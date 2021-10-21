package datastructures.z.problems.search;

public class BinarySearchOnSortedArray {

	private static int binarySearch(int i, int length, int[] arr, int key) {
		
		if(length >= i) {
			int mid = i + (length - i )/2;
			if(arr[mid] == key) {
				return mid;
			}
			
			if(key > arr[mid]) {
				return binarySearch(mid + 1, length, arr, key);
			} else if(key < arr[mid]) {
				 return binarySearch(0, mid-1, arr, key);
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8};//new int[10];
	
		int key = 3;
		int val = binarySearch(0,arr.length,arr, key);
		System.out.println(val);
	}
}
