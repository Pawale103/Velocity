package Static_And_Non_Static;

public class constructorclass {
	
	
	public constructorclass()                                  // constructor name should be same as class name.
	{
		this(10);                                               // this should be used in first line of the constructor.
		System.out.println("this is zero parameter constructor"); //constructor is a special type of method it is used to Inatlise  the class instance variable 
	}
	public constructorclass(int a)                        // constructor will be called as soon as object is created don't have to call the constructor separately
	                                                                 
	{   this(10,"patil");
		// constructor will not retrun anything not even void.
		
		System.out.println("this is one parameter constructor");
	}
	public constructorclass(int a,String b)
	{
		System.out.println("this is two parameter constructor");
	}

	public static void main(String[] args) {
		
		constructorclass obj1=new constructorclass();
		
		constructorclass obj2 = new constructorclass(10);
		
		constructorclass obj3 = new constructorclass(10, "patil");
		System.out.println("******************************************************");
		
		constructorclass obj4 = new constructorclass();
		
		
		
	}

}
