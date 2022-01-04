package Algorithms;

import Algorithms.search.BinarySearch;
import Algorithms.search.LinearSearch;
import Algorithms.search.SentinelSearch;
import Algorithms.sorting.MergeSort;
import Algorithms.sorting.QuickSort;

public class AlgorithmsMain {

	public static int[] sortedArray = {2,3,4,5,6,7,8};//new int[10];
	public static int[] array = {6,2,5,3,8,7};//new int[10];
	public static int arrayLength, key, i;
	//https://www.fullstack.cafe/blog/searching-algorithms-interview-questions
	public static void main(String[] args) {
		
		/** 
		 * Search algorithms 
		 * Worst to best
		 */
		//recursive binary search on sorted array
		key = 3;
		i = 0;
		arrayLength = sortedArray.length - 1;
		
		
		//O(n)
		// worst case 2n + 1 comparisions
		int val = LinearSearch.linerSearch(key, array);
		System.out.println(val);
		
		// replace last element with key, no index out of bound
		//worst case would be n + 2 comparisions
		SentinelSearch.sentinelSearch(arrayLength,array,key);
		
		
		
		//O(log n) time complexity
		//O(1) space complexity
		val = BinarySearch.binarySearchSortedArray(i,arrayLength,sortedArray,key);
		System.out.println(val);
		
		val = BinarySearch.binarySearchIterative(arrayLength,sortedArray,key);
		System.out.println(val);
		
		
		
		/**
		 * sORTING
		 * 
		 */
		//QUICKSORT
		int[] qArray = array;
		QuickSort.qSort(qArray, 0, arrayLength);
		
		
		//mergesort
		int[] mArray = array;
		MergeSort.sort(mArray, 0, arrayLength - 1);
	}

}
