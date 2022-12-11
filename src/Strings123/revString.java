package Strings123;

public class revString {

	public static void main(String[] args) {
		
		
		String original="This country is mine";
		String rev="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println(rev);
		
		String colour ="red";
		if(colour=="red")
		{
			System.out.println("stop");
		}

	}
	
	
	
}
