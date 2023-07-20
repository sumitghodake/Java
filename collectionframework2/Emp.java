package collectionframework2;
import java.util.*;
public class Emp implements Comparable<Emp>
{
	int eid;
	String ename;
	int salary;

	public Emp(int eid, String ename, int salary) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public boolean equals (Object obj)
	{
		boolean flag = false;

		Emp e = null;

		if(obj instanceof Emp)
		{
			e=(Emp)obj;
			if(this.ename.equals(ename))
			{
				flag=true;
			}

		}
		return flag ;
	}
	
	public int compareTo(Emp o) 
	{



		if(this.salary > o.salary)
			return 1;
		else
			return -1;








		//		int diff;
		//		diff=this.dept.compareTo(o.dept);
		//	    
		//		if(diff==0)
		//		{
		//			if(this.salary<o.salary)
		//			    diff=1;
		//			else if(this.salary>o.salary)
		//				diff=-1;
		//			else
		//			{
		//				diff=this.ename.compareTo(o.ename);
		//				if(diff==0)
		//					diff=this.eid-o.eid;
		//			}
		//		}
		//		
		//			
		//		
		//		return diff;

	}



}
