package javaprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ParentThrows {

	
	public void noExceptionMethod() {
		System.out.println("no exp");
	}
	public void exceptionMethod() throws ArithmeticException{
		System.out.println("ArithmeticException parent");
		int i = 1/0;
	}
	
	public void exceptionMethodA() throws ArrayIndexOutOfBoundsException{
		System.out.println("ArrayIndexOutOfBoundsException parent");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
	}
	
	public void checkedExceptionWithThrows() throws FileNotFoundException {
	    File file = new File("not_existing_file.txt");
	    FileInputStream stream = new FileInputStream(file);
	}
	
	public void unCheckedExceptionWithThrows() throws ArrayIndexOutOfBoundsException {
		System.out.println("ArrayIndexOutOfBoundsException array child");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
	}
	
	
	//random // no issue observed
	public void allExceptionsRandom() throws FileNotFoundException, ArrayIndexOutOfBoundsException, Exception  {
		System.out.println("ArrayIndexOutOfBoundsException array child");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
		
		 File file = new File("not_existing_file.txt");
		    FileInputStream stream = new FileInputStream(file);
	}
	
	//parent to child // no issue observed
	public void allExceptionsParentToChild() throws Exception,FileNotFoundException, ArrayIndexOutOfBoundsException  {
		System.out.println("ArrayIndexOutOfBoundsException array child");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
		
		 File file = new File("not_existing_file.txt");
		    FileInputStream stream = new FileInputStream(file);
		    throw new Exception("e");
	}
	
	//child  to parent // no issue observed
	public void allExceptionsChildToParent() throws ArrayIndexOutOfBoundsException,FileNotFoundException, Exception  {
		System.out.println("ArrayIndexOutOfBoundsException array child");
		int[] a = new int[1];
		a[0] = 0;
		a[1] = 1;
		
		 File file = new File("not_existing_file.txt");
		    FileInputStream stream = new FileInputStream(file);
		    throw new Exception("e");
	}
		

	//child  to parent // no issue observed
	public void allExceptionsTryCacth()   {
		
		
		 File file = new File("not_existing_file.txt");
		    try {
		    	System.out.println("ArrayIndexOutOfBoundsException array child");
				int[] a = new int[1];
				a[0] = 0;
				a[1] = 1;
				FileInputStream stream = new FileInputStream(file);
				throw new Exception("e");
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	}
		
}
