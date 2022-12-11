package interface1;

public class ImpClass2 extends ImpClass1{
	
	public void m3()
	{
		System.out.println("method m3 is running");
	}

	public static void main(String[] args)
	{
		ImpClass2 obj= new ImpClass2();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println("the value of var a is:"+a);
	}
}
