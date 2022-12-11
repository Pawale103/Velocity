package interface1;

public class  ImpClassForInterface2 extends NewClass implements Intface2{
                                      // we can extend and implement at a time
	                                     // also we can implement multiple interface in one class.
	@Override
	public void m4() {
		System.out.println("method m4 is running");
		
	}

	@Override
	public void m5() {
		System.out.println("method m5 is running");	
		
	}
	public static void main(String[] args)
	{
		
		ImpClassForInterface2 var1= new ImpClassForInterface2();
		var1.m4();
		var1.m5();
		var1.test();
		var1.student();
		var1.teacher();
		
	}

}
