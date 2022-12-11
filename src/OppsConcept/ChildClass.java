package OppsConcept;

public class ChildClass extends ParentClass {
	
	public ChildClass(int c)
	{
		System.out.println("this is one agrument constructor in child class");
	}
	

	public static void main(String[] args) {
		ChildClass var= new ChildClass(10);        // constructor does not follow inheritance 
		
		
		
	}

}
