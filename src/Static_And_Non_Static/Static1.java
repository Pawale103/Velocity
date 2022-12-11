package Static_And_Non_Static;

public class Static1 {
	
	public static void test1()
	{
		System.out.println("This is  static method1 in Static1 class");
	}
	
	
	public static void test2()
	{
		Static1 obj= new Static1();// while creating method in one another if we create loop then Stack memory will be full and stack overflow error will arise.
		                             // like this class.
		obj.print();
		
		System.out.println("this is static method2 in static1 class");
	}
	
	public void print()
	
	{
           test2();
           test1();
		System.out.println("this is print method in static1 class(non static method)");
	}
	
	public static void main(String[] args) {
		
		test1();
		test2();
		Static1.test1();
		Static1.test2();
		Static1 obj= new Static1();
		obj.print();
		

	}

}
