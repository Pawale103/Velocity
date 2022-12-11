package AbstractPackage;

public abstract class Test1 {
	public  Test1()
	{
		this(10);
		System.out.println(" test one constructor");                  
	}
	public Test1(int i)
	{
		System.out.println("this is one argument constructor from Test1 class");
	}
	
	private final void m1()
	{
		System.out.println("this is method  m1 from test1"); // abstract class can have the constructor with the help of child class object it will automatically 
		                                                     // the zero argument constructor from parent class.
	}                                                        // abstract class can have final method
	public final void m2()
	{
		System.out.println("this is method m2 from test2");
	}
	public abstract void m3();
	
	public abstract void m4();
	                                            // We can not create the object of the abstract class.
	                                            // we generally create abstract class for unimplemented functionality 

	public static void main(String[] args) {
		
	}
	/* we can not use abstract and final together  and also we can not use private and abstract together
	 1. for abstract class it is necessary to have child class
	 2.for final class we can not have child class
	 3.private can be accessed within class
	 */

}
