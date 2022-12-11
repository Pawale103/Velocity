 package Array;

public class MethodReturnArray {
	
	public String[] m1()
	{
		String s[]= {"abc","scgs","sjfsf",};// return type as a string array
		return s;
	}
	public static void main(String[] args) {
		
		MethodReturnArray mx=new MethodReturnArray();
		
		for(String ss:mx.m1())
		{
			System.out.println(ss);
		}
		
		
		
	}

}
