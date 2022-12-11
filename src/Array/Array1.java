package Array;

public class Array1 {

	public static void main(String[] args) {
		
		
		int a[]= new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int b[]= {1,2,3,4,5,6,7,8,9,10,20,21,25,26};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				System.out.println(b[i]);// print only even numbers of array
			}
		}
		int sum=0;
		for(int i=0;i<b.length;i++)      // sum of all the array 
			
		{
			
			 sum=sum+b[i];
		}
		System.out.println(sum);
		
		int summation=0;
		for(int i:a)
		{
		   summation=summation+i;	
			System.out.println(i);
		}
		System.out.println(summation);
		int sum1=0;
		for(int i=0;i<=100;i++)
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);

	}

}
