package Strings123;

public class String1 {

		
		String s;
		
		public void m1()
		{
			s="abc";
		}
		
		public static void main(String[] args)
		{
			String school="Shanti Niketan high school";  // String is a class which is defined in lang package and it is immutable.
			                                             // by defining string this way object will be created in String poll area only.
			                                             // duplicate object will not be created in String poll area.
			
		System.out.println(school.concat(" is my old school"));
		
		String concated =school.concat(" Is spacious");
		
		System.out.println(concated);
		
		System.out.println(school);
		
		StringBuffer sb=new StringBuffer("This is mutable string");//In this case String is mutable 
		sb.append("i told you so");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);      // reverse String with the help of StringBuffer.	
		String str = new String("abc");
		
		String str1= new String("abc");
		
		String str2= "abc";
		
		String str3 ="abc";
		System.out.println(str2==str3);// true
		System.out.println(str==str1);//false
		System.out.println(str1==str2);//false
		
		System.out.println(str.equals(str1));//true this method will check the content is equal or not.
		System.out.println(str.equals(str3));//true
		System.out.println((str2==str3));//true
		System.out.println(str1.equals(str3));//true
		

		
	
			
			
			
			
			
			
			
			
		}
	


	}


