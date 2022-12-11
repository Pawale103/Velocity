package AccessModifiers;

public class AccessModifierClass2 extends AccessModifierClass1 {
	
	public void mod()
	{
		System.out.println("this is mod method in AccessModifierClass2");
	}

	public static void main(String[] args) {
		
		AccessModifierClass1 var= new AccessModifierClass1();   // we are accessing the method with the help of object
		                     
		var.count();                                          // another method that is by extending and creating the object of child class.
		
		AccessModifierClass2 var2 = new AccessModifierClass2();
		var2.count();
		var2.mod();
		

	}

}
