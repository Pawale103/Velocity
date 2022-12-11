package Strings123;

public class String2 {

	public static void main(String[] args) {
		
		String one="abc123sfi4654911";
		
		for(int i=0;i<one.length();i++)
		{
			if(Character.isDigit(one.charAt(i)))
			{
				System.out.println(one.charAt(i));
			}
		}
		System.out.println("***********************************************");
		for(int c=0;c<one.length();c++)
		{
			if(Character.isLetter(one.charAt(c)))
			{
				System.out.println(one.charAt(c));
			}
		}
		

	}

}
