package Polymorphism;

public class Test {
	
	
	public void m1()
	{
		System.out.println("this is zero agrument method m1");
	}
	public void m1(String s)
	{
		System.out.println("this is method m1 with String argument");      // these all methods are example of method overloading 
		                                                                  // return type is not considered
		                                                                  // same method name with different method signature is known as method overloading.
	}
	public int m1(int a)
	{
		System.out.println(" this is method m1 with int argument and return type int");
		return 10;
		
	}

	public static void main(String[] args) {
		Test var = new Test();
		var.m1();
		var.m1("abc");
		var.m1(20);
	}

}
