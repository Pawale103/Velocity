package AccessModifiers;

public class AccessModifierClass1 {          // Scope of the public access modifier is throughout the project 
	                                         // we can access this class and it's methods by creating object and extending this class into another class
	
	public void count()
	{
		System.out.println("this is count method in AccessModifierClass ");
	}

	public static void main(String[] args) {
		AccessFinalClass var = new AccessFinalClass();    //accessing final class using object.
		var.final1();
		
	}

}
/*their are manly 4 types of access modifiers for the class 
1.public
2<default>
3.final
4.abstract  */