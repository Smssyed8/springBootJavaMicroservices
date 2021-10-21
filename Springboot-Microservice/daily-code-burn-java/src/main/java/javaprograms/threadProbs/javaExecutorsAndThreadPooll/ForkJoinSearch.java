package javaprograms.threadProbs.javaExecutorsAndThreadPooll;
// Java program to demonstrate the working of Fork/Join
// Framework
 
// Importing required libraries
import java.io.*;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
 
// Class 1
// helper class
class ForkJoinSearch extends RecursiveTask<Integer> {
 
    // Global variables
    int array[];
    int start, end;
    int searchElement;
 
    // Constructor for initialising globals
    public ForkJoinSearch(int array[], int start, int end,
                      int searchElement)
    {
 
        // This keyword regers to current object itself
        this.array = array;
        this.start = start;
        this.end = end;
        this.searchElement = searchElement;
    }
 
    // Method
    // @Override
    protected Integer compute()
    {
 
        // Returns the count computed by processSearch
        return processSearch();
    }
 
    // Method
    // To count the the count of searched element
    private Integer processSearch()
    {
 
        // Initially count os set to zero
        int count = 0;
 
        // iterating using for loop
        for (int i = start; i <= end; i++) {
 
            // if element is present in array
            if (array[i] == searchElement) {
 
                // Increment the count
                count++;
            }
        }
 
        // Returning the count of searched element
        return count;
    }
}