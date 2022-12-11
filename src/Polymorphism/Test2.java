package Polymorphism;

public class Test2 extends Test {
	
	public void m1(String s,String t)
	{
		System.out.println("this is two parameter method in test2 class");         // method overloading in another class.
	}
	
	

	public static void main(String[] args) {
		Test2 var = new Test2();
		var.m1();
		var.m1(10);
		var.m1("abc");
		var.m1("abc","xyz");
		
	}

}
