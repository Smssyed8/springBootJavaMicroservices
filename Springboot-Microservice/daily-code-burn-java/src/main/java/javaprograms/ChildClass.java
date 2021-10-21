package javaprograms;

public class ChildClass extends ParentClass{
	void sum(int a,long b){System.out.println(a+b);}  
	
	//covariant type, return type of overriding method can be changed to child type
	//covariant return type specifies that the return type may vary in the same direction as the subclass.
	ChildClass get(){return this;}  
	void message(){System.out.println("welcome to covariant return type");}  
	
	public ChildClass() {
		System.out.println("Child is created");
	}
	
	public ChildClass(String parentId) {
		super(parentId); //constructor chaining using super. super or this should always be first
		//this(); //compiler error Constructor call must be the first statement in a constructor
	}
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId + " child";
	}

	//@Override
	public void parentMethod() { // 
		//private void parentMethod() can be overriden  to public 
		// public to private or protected cant be done, 
		//shows as cannot decrease visibility of inherited method
		System.out.println("child clas overrides public parent");
	}
	
	public static void parentMethod(String s) { // cant overload just by static
		System.out.println("child clas overrides public parent");
	}
	
	
	public void publicParentMethod() {
		System.out.println("child clas overrides public parent");
	}
	
	private String parentId;
}
