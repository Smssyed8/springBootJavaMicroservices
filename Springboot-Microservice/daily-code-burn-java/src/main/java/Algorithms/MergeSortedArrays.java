package Algorithms;
/*
 * mistakes i do, try to solve in single loop
 * have multiple loops
 * calculate for all statements
 */
public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 7};
		int[] arr1 = {1, 2, 4, 6, 8};
		int n = arr.length;
		int n1 = arr1.length;
		int[] arr2 = new int[n + n1];
	
		int i = 0, j = 0 , k = 0;
		while(i < n && j < n1) {
			if(arr[i] < arr1[j]) {
				arr2[k++] = arr[i++]; 
			} else {
				arr2[k++] = arr1[j++]; 
			}
		}
		
		while(i < n) {
			arr2[k++] = arr[i++];
		}
		
		while(j < n1) {
			arr2[k++] = arr1[j++];
		}
		
		System.out.println("Array after merging");
        for (int l=0; l < n + n1; l++)
            System.out.print(arr2[l] + " ");
    }
	

}
