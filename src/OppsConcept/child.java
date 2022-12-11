package OppsConcept;

public class child extends parent {// this is inheritance.
	
	public void college()
	{
		System.out.println("method college is running");
		System.out.println(aa);// variable from the super class 
		System.out.println(super.aa);  
	}
	
	
	
	

	public static void main(String[] args) {
		
		parent var= new parent();// this is normal calling of methods from another class with the help of object.
		                              
		var.home();
		var.car();
		var.bike();
		
		child var1 = new child();// with the help of inheritance we can access the parent methods as well as  child methods by creating the object of child.
		var1.home();
		var1.car();
		var1.bike();
		var1.land();// method form GrandParent class
		var1.college(); 
		// cyclic inheritance is not possible is java . that is child extends parent and parent extends child.
		
		// when their is confusion between local variable and global non static variable that is both the variables same then  super and this keyword is used to 
		// refer the global variable in non static method(bcz this and super can not be used in static method)
		
		
	

	}

}
