package collectionframework3;
import java.util.*;

public class Priority 
{
	public static void main(String[] args)
	{
		Queue <String>  Q1 =new PriorityQueue<>();
		
		new Comparator<String>() 
		{
			public int compare(String o1,String o2)
			{
				int diff=o1.length()-o2.length();
				if(diff==0)
				{
					diff =o1.compareTo(o2);
					
				}
				return diff;
			}
			
		};
		
		Q1.add("Sumit");
		Q1.add("Adya");
		Q1.add("Yogi");
		Q1.add("Rohit");
		Q1.add("Siddha");
		
		System.out.println(Q1);
		
	}
	
	

}
