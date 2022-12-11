package Static_And_Non_Static;

public class NonStatic1 {
	
	public void Print1()
	{
		System.out.println("this is non static print1 method from NonStatic1 class");
	}
	
	public static void print2()
	{
		System.out.println("this is static method from NonSatic1 class");
	}
	
	public void print3()
	{
		Print1();
		print2();
		System.out.println("this is non static print3 method from NonStatic1 class");
	}
	
	
	
	public static void main(String[] args) {
		
		print2();
		
		NonStatic1 obj1= new NonStatic1();
		obj1.print3();
		
	}

}
