package ExceptionHandling;

public class TryAndCatch1 {

	public static void main(String[] args) {
		
		int i=10;
		int b=0;
		System.out.println("Before exception handling");
		try
		{
			int c= i/b;
		}
	/*	catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("catch block is running");
			int c=5;
			System.out.println(c);		
		}*/
		catch(NullPointerException | ArithmeticException e)// By this way we can write multiple exceptions in single catch block.
		{
			System.out.println("Null pointer catch block is running");
		}
		catch(Exception e)// this catch block should not be used because it will difficult while trouble shooting the program and finding the error.
		{
			System.out.println("Universal catch block");// any exception can be handled using this catch block.
		}
		finally
		{
		System.out.println("finally block always executes");// exception handled or not finally block will always execute. we generally write cleanup code in that.	
		}
		
		System.out.println("After exception handling");   
		
		
		

	}

}
