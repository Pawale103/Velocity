package Array;

public class CharArray {
	

	public static void main(String[] args) {
		int count=0;
		
		char a[] = {'a','b','a','a','c','d','e'};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a')
			{
				count++;
			}
			
		}
		System.out.println(count);
		}
		
	}


