package javaprograms;

import java.io.FileNotFoundException;

//https://www.javatpoint.com/corejava-interview-questions
public class JavaMain {

	JavaMain(int a, int b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
	JavaMain(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }
	//object oriented paradigm follows Follows the bottom-up approach in program design
	//cant execute without main
	//Program compiles. However, at runtime, It throws an error "NoSuchMethodError."
	//Yes, all functions in Java are virtual by default.
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, FileNotFoundException, Exception {
		//The local variables are not initialized to any default value, 
		//neither primitives nor object references.
		//int i = 0;
		//JavaMain main = null;
		//System.out.println(main);
		
		//No, we cannot override private or static methods in Java
		ParentClass p = new ChildClass();
		//p.parentMethod();
		p.publicParentMethod();
		p.setParentId("1");
		System.out.println(p.getParentId());
		//p.privateParentMethod();
		
		ParentClass parent = new ParentClass();
		parent.setParentId("1");
		//parent.i; // insert variable declaration to complete declaration
		System.out.println(parent.getParentId());
		
		
		/*
		 * ChildClass c = (ChildClass) new ParentClass(); // class cast exception
		 * c.parentMethod(); 
		 * c.publicParentMethod(); 
		 * c.setParentId("1");
		 * System.out.println(c.getParentId());
		 */
		
		// output of following 
		//String concantenation with + * precendence
		 System.out.println(10 + 20 + "Javatpoint");  //prints 30Javatpoint 
	     System.out.println("Javatpoint" + 10 + 20);  //prints Javatpoint1020
	     
	     System.out.println(10 * 20 + "Javatpoint");   // 200javatpoint
	     System.out.println("Javatpoint" + 10 * 20);  //javatpoint200
	     
	     //byte to int float
	     byte a = 10;   
	        byte b = 15;  
	        JavaMain test = new JavaMain(a,b);  // 10,15
	        
	        
	        ChildClass c = new ChildClass();
	        c.sum(10, 'a');
	        c.get().message();
	        Double d = 0.0001;
	       // c.sum(10, d);cant accept higher types// compiler
	        
	        
	        //exception handling, parent and child throws and not throw
	        ParentThrows parentTh = new ChildThrows();
	        //parentTh.exceptionMethod();
	        //parentTh.noExceptionMethod();
	        //parentTh.exceptionMethodA();
	        //parentTh.checkedExceptionWithThrows();
	        
	        ChildThrows cTh = new ChildThrows();
	        //cTh.checkedExceptionWithThrows();
	        
	        
	        //unchecked exception addition is optional in throws
	        ParentThrows pTh = new  ParentThrows();
	        //pTh.checkedExceptionWithThrows();
	        //pTh.allExceptionsRandom();
	        //pTh.allExceptionsParentToChild();
	       //pTh.allExceptionsChildToParent();

	}

}
