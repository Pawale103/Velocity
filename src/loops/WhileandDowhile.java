package loops;

public class WhileandDowhile {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=30;
		while(a<=b)                 // while loop entry controlled loop it will enter loop when condition is true.
		{
			System.out.println(a);
			a++;
		}
		int c=10;
		int d=20;
		do
		{
			System.out.println(" do block is running");
			d--;
		}
		while(d>=c);
		
		for(int m=1;m<=10;m++)
		{
			System.out.println("The value of m is :"+m);// in for loop we declare the variable , then put the condition, and increment the variable.
			
			if(m>8)
			{
				break;              // break statement is used to terminate the loop, here we used one condition and break statement to terminate the loop.
			}
			
			
		}
		
		
		
	}

}
