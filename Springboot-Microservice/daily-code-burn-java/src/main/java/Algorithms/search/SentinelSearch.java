package Algorithms.search;

public class SentinelSearch {

	 // Function to search x in the given array
    public static void sentinelSearch(int n,int arr[], int key)
    {
 
        // Last element of the array
        int last = arr[n - 1];
 
        // Element to be searched is
        // placed at the last index
        arr[n - 1] = key;
        int i = 0;
 
        while (arr[i] != key)  // n comparisions
            i++;
 
        // Put the last element back
        arr[n - 1] = last;
 
        if ((i < n - 1) || (arr[n - 1] == key))   // 2 comparision
            System.out.println(key + " is present at index "
                               + i);
        else 
            System.out.println("Element Not found");
    }
    
}
