package Algorithms;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortBasedOnFirstAndLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"syed muazzam", "sharath naik", "Shyam ah", "syed ahmed" , "kushal kumar", "syed khan"};

		List<String> ls = Arrays.stream(arr)
				//.map(i -> i.toLowerCase())
				
				.collect(Collectors.toList());
		Collections.sort(ls);
		
		for(String a: ls) {
			System.out.println(a);
		}
	}

}
