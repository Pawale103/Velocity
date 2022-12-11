package AbstractPackage;

public abstract class  Test2  extends Test1 {
	public Test2()
	{
		System.out.println("This is test2 zero argument constructor");
	}

	public static void main(String[] args) {
		
	}

	@Override
	public void m3() {              
		
		
	}               // now we know the functionality of the m3 but we still don't know the functionality of the m4 method so we have to declare this class as abstract.

	public void m5()
	{
		System.out.println("this is m5 method from class test2");
	}

}
