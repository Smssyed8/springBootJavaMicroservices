package javaprograms;

public class ParentClass {

	final int v;
	static final int z;
	static{
		z=0;
		};
	ParentClass(){
		  this.v = 0;
		//this = null;    error: cannot assign a value to final variable this
		//this.parentId;
		System.out.println("Parent is created");
	}
	
	ParentClass get(){return this;}  
	//contructor chaining
	ParentClass(int i){
		this.v = 0;
		this.i = i; 
	}
	
	ParentClass( String parentId){
		this.v = 0;
		this.parentId = parentId;
	}
	
	ParentClass(int i , String parentId){
		this(i); // this is final and syncrhonized
		this.parentId = parentId;
	}
	int i = 0; 
	//int final static s;
	//static block
	static{System.out.println("static block is invoked");}  
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId + " parent";
	}

	private String parentId;
	//check private access specifier in child class
	//private cannot be accessed in child
	// wont be visible for child object
	// private and static cannot be overriden
	//private void privateParentMethod() { System.out.println("parent private method"); }
	 
	private void parentMethod() {
		System.out.println("parent public method");
	}
	
	public void parentObject() {
		
	}
	
	public void publicParentMethod() { System.out.println("parent public method"); }
	
}
