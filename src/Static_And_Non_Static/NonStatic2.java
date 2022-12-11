package Static_And_Non_Static;

public class NonStatic2 {
	
	public void info()
	{
		System.out.println("this is non static info method from NonStatic class");
	}
	
	public static void info2()
	{
		System.out.println("this is static method in NonStatic2 class");
	}
	
	public void info3()
	{
		info();                                  //calling of non static method from same class.
		info2();                                 // calling of static method in non static method from same class.
		NonStatic1 obj = new NonStatic1();
		obj.Print1();                            // calling of non static method from another class.
		NonStatic1.print2();                     // calling of static method from another class.
		System.out.println("this is info 3 method ");
	}
	public static void info4()
	{
		
	}

	public static void main(String[] args) {
		

	}

}
