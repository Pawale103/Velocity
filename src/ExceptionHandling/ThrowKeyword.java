package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args)throws Throwable {// Throwable is  a parent class of all exceptions 
		
		System.out.println("before throw keyword");
		try
		{
		throw new ArithmeticException("Testing throw keyword");// with throw keyword we can create the exception and with Throwable we handle the exception.
		 // we can handle the exception with try and catch block which is more reliable. with throwable we can not stop the abnormal termination for program
		// but try and catch can stop the abnormal termination for program.
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("this is catch block of exception");
		}
		
		finally
		{
			System.out.println("this block will always executes");
		}
		System.out.println("Before Thread sleep");
		
		Thread.sleep(5000);
		
		System.out.println("After thread sleep");
		
	}

}
