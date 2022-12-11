package loops;

public class ControlStatement1 {

	public static void main(String[] args) {
		
		
	OuterForLoop:  for(int i=1;i<=5;i++)
		{
			InnerForLoop: for(int j=1;j<=5;j++)
			{
				if(j>2)
				{
					System.out.println(j);
					break OuterForLoop;
				}
			}
		}
	
	System.out.println("****************************************************");
	
	  for(int i=0;i<=5;i++)
	  {
		  if(i%2==0)
		  {
			  continue;   // after if condition is true then it will go to next iteration  without printing the i but if condition is false then it will not 
			               // execute the continue statement and it will   print the i.
		  }
		  System.out.println(i);
	  }
	  
	  
		

	}

}
