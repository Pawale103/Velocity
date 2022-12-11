package TypeCasting;

public class ClassB extends ClassA {
	public void m1()
	{
		System.out.println("this is m1 method from class B");
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		
		ClassA aa= (ClassA)b; // this is class type casting , inheritance is required for class type casting 
		
		aa.m1();
		
		/*ClassA a= new ClassA(); // we can not type cast such a way that child class will hold the object of parent 
		
		ClassB bb= (ClassB)a;
		 bb.m1(); */
		
		
		

	}

}
