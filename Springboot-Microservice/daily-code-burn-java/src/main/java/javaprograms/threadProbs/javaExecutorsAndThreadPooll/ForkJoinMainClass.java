package javaprograms.threadProbs.javaExecutorsAndThreadPooll;
//https://www.geeksforgeeks.org/difference-between-fork-join-framework-and-executorservice-in-java/#:~:text=Fork%20Join%20is%20an%20implementation,all%20the%20remaining%20waiting%20task.
import java.util.concurrent.ForkJoinPool;

public class ForkJoinMainClass {
	 
    // main driver method
    public static void main(String args[])
    {
 
        // Custom input array elements
        int array[] = { 1, 2, 6, 3,  4,  5,  6,
                        7, 8, 9, 10, 11, 12, 6 };
 
        // Custom element to be searched in array
        int searchElement = 6;
 
        // initializing starting and ending indices
        int start = 0;
        int end = array.length - 1;
 
        // Creating object of ForkJoinPool class
        ForkJoinPool pool = ForkJoinPool.commonPool();
 
        // Now creating object of above class
        ForkJoinSearch task = new ForkJoinSearch(array, start, end,
                                         searchElement);
        int result = pool.invoke(task);
 
        // Print and display the searched element
        // If found do display out the number of times it is
        // found
        System.out.println(searchElement + " found "
                           + result + " times ");
    }
}