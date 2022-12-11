package Static_And_Non_Static;




public class DiffReturnTypes {
	
	static int a=30;                     //    Static variable are class level variable we can not define static variable inside a method.
	int b  =50;                          // these 2 are global variables 
	 
	public void college()               // method with return type void
	{
		int a=70;
		int b=40;                       // we can define non static variable inside a method.
		                                // these 2 are local variables. we can not access the local variables  outside a method. 
		                                 
		System.out.println(a+b);
		
		System.out.println("This method will not retrun anything its return type is void");
	}
    
	public int college1()               // method with return type integer
	{
		System.out.println("this method will return the value 2");
		return 2;
	}
	public int college2(int a,int b)    // method with return type integer and arguments
	{
		int d=a+b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		return d;
	}
	
	
	
	public static void main(String[] args) {
		
		DiffReturnTypes var= new DiffReturnTypes();
		
		var.college();
		int returnvar=var.college1();
		System.out.println("the returned value by method college1 is"+returnvar);
		System.out.println(var.college1());
		int dval=var.college2(20, 50);
		System.out.println("The value of returned var is "+dval);
		var.college3();
		
		

	}
	public void college3()
	{
		System.out.println("This is college3 method in DiffReturnTypes class");
	}
	
	

}
