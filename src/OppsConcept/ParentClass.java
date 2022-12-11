package OppsConcept;

public class ParentClass {
	
	public  ParentClass()
	{ 
		this(10);
		System.out.println("parent class constructor is running");
	}
	public  ParentClass(int i)
	
	{
		this(10,20);
		
		System.out.println("this is one argument constructor ");
	}
	public ParentClass(int a, int b)
	{
		System.out.println("this is two argument constructor");
	}

	public static void main(String[] args) {
		
	}

}
