package datastructures.z.problems.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgos {
    public static int[] bubbleSort(int[] arr){
     int temp = 0;
     for(int i = 0; i < arr.length; i++){
         for(int j = 1; j < arr.length - i; j++){
             if(arr[j-1] > arr[j]){
                 temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;
             }
         }
     }
     return arr;
    }

    public static int[] selectionSort(int[] args){
        for(int i = 0; i < args.length - 1; i++){
            int integer = i;
            for(int j = i + 1; j < args.length; j++){
                if(args[j] < args[i]){
                    integer = j;
                }
                int temp = args[integer];
                args[integer] = args[i];
                args[i] = temp;
            }
        }
        return  args;
    }

    public static int[] selectionSortByScanInput(){
        int size, i, j, temp;
        int array[] = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        size = scan.nextInt();

        System.out.print("Enter Array Elements : ");
        for(i=0; i<size; i++)
        {
            array[i] = scan.nextInt();
        }

        System.out.print("Sorting Array using Selection Sort Technique..\n");
        for(i=0; i<size; i++)
        {
            for(j=i+1; j<size; j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void insertionSort(int array[]) {
        //{1, 2, 0, 8, 4};
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];        //key = 2
            int i = j-1;               //i = 0
            while ( (i > -1) && ( array [i] > key ) ) {   // i > -1 && 1 > 2
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }


    public static void main(String args[]) {
        int[] arr = {1, 2, 0, 8, 4};

        System.out.println("before sorting with bubble sort");
        Arrays.stream(arr).forEach(e -> System.out.print(e));

        bubbleSort(arr);
        System.out.println("after sorting with bubble sort");
        Arrays.stream(arr).forEach(e -> System.out.print(e));

        int[] arr1 = {1, 2, 0, 8, 4};

        System.out.println("before sorting with selection sort");
        Arrays.stream(arr1).forEach(e -> System.out.print(e));

        selectionSort(arr1);
        System.out.println("after sorting with selection sort");
        Arrays.stream(arr1).forEach(e -> System.out.print(e));


        ///Another way for selection sort
        int[] sortInpurtArray = selectionSortByScanInput();
        System.out.print("Now the Array after Sorting is :\n");
        for(int i=0; i<sortInpurtArray.length; i++)
        {
            System.out.print(sortInpurtArray[i]+ "  ");
        }


        int[] arr2 = {1, 2, 0, 8, 4};

        System.out.println("before sorting with insertion sort");
        Arrays.stream(arr2).forEach(e -> System.out.print(e));

        insertionSort(arr2);
        System.out.println("after sorting with insertion sort");
        Arrays.stream(arr2).forEach(e -> System.out.print(e));
    }
}
