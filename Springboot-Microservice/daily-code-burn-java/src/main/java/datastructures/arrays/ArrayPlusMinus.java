package datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class ArrayPlusMinus {

	
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    float p = 0;
	    float n = 0;
	    float z = 0;
	    int listSize = arr.size();
	    for(Integer a:arr){
	        if(a > 0){
	            p++;
	        } else if(a < 0) {
	            n++;
	        } else {
	            z++;
	        }
	    }
	    System.out.println(p/listSize);
	    System.out.println(n/listSize);
	    System.out.println(z/listSize);

	}
}
