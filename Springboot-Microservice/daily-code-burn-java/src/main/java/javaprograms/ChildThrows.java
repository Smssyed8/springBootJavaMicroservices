package javaprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChildThrows  extends ParentThrows{
	//Exception is not compatible with throws clause in ParentThrows.noExceptionMethod()
	//cant throw checked exception if parent method is not throwing any exception
	/*
	 * public void noExceptionMethod() throws Exception{
	 * System.out.println("no exp child 1"); }
	 */
	
	//can throw unchecked- runtime exception
	public void noExceptionMethod() throws ArithmeticException{ int i = 1/0; }
	 
	public void exceptionMethod() throws ArithmeticException{
		System.out.println("ArithmeticException child");
		int i = 1/0;
	}
	
	//when parent method throws exception
	// child should throw same/child/sub exception, but not parent exception.
	/*
	 * public void exceptionMethod() throws Exception{ System.out.println("no exp");
	 * int i = 1/0; }
	 */
	
	public void exceptionMethodA() throws ArrayIndexOutOfBoundsException{
		// while it is not arithmetic, STILL working with arithmetic
		//
		System.out.println("ArrayIndexOutOfBoundsException array child");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
	}
	
	
	//PARENT HAD CHECKED, CHILD HAS UNCHECKED
	public void checkedExceptionWithThrows() throws ArrayIndexOutOfBoundsException {
		System.out.println("ArrayIndexOutOfBoundsException array child");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
	}
	//Exception FileNotFoundException is not compatible with throws clause in 
	//ParentThrows.unCheckedExceptionWithThrows()
	
	//PARENT HAS UNCHECKED AND CHILD HAS CHECKED, DOESNT WORK // COMPILER
	/*
	 * public void unCheckedExceptionWithThrows() throws FileNotFoundException {
	 * File file = new File("not_existing_file.txt"); FileInputStream stream = new
	 * FileInputStream(file); }
	 */
}
