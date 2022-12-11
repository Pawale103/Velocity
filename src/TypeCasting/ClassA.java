package TypeCasting;

public class ClassA {
	public void m1()
	{
		System.out.println("this is method m1 from classA");
	}

	public static void main(String[] args) {
		
		byte b=20;           //this is implicit casting of primitive data type or also known as widening type casting or Up casting
		int a =(int )b;
		short c=(short)a;
		long d= (long)c;
		System.out.println(d);
		                      // this is explicit type casting or casting down or narrowing type casting
		long l=4000;
		short p=(short)l;
		int m=(int )p;
		System.out.println(m);
		
		
		
		
	}

}
