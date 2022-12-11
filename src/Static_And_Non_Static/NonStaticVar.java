package Static_And_Non_Static;

public class NonStaticVar {
	
	static int a=20;	
	
	
	static String str="My name"; // this is static string //string is a class according to camel convention 
	// first letter is capital.
	
	String str1 ="my name";      // non static string 
	                            // all the keywords in java are in small letters // all the identifiers first letter in capital such as String;
	
	int b=30;               // this and super keyword is only applicable to non static area. 
	
	public  NonStaticVar()
	{
		System.out.println("this is constructor");               //by this way we can define constructor.
	}
	
	public void NonStaticVar()
	{
		System.out.println("this is method with same name as class name");  // by this way we can define the method but this is not recommended this will create confusion.
	}

	public static void main(String[] args) {
		
		NonStaticVar var=new NonStaticVar();
		int c=var.b=40;
		System.out.println(var.b);//output 40
		System.out.println(c);    //output 40
		NonStaticVar var1=new NonStaticVar();
		System.out.println(var1.b);  // output 30      
		
		// we can also access the static variables using object but it is not recommended.
		
		

	}

}
