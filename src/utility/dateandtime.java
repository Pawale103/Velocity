package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateandtime {
	
	public static void main(String[]args)
	{
		
		LocalDateTime localdate= LocalDateTime.now();
		
		//System.out.println(localdate);
		DateTimeFormatter dt= DateTimeFormatter.ofPattern("MM-dd-YY h:mma");
		 
		System.out.println(dt.format(localdate));
	}

}
