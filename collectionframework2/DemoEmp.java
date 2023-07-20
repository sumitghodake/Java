package collectionframework2;
import java.util.*;
public class DemoEmp 
{
	public static void main(String[] args){


		Emp e1  = new Emp(202,"Sumit",100000);
		Emp e2  = new Emp(203,"SHIV",200000);
		Emp e3  = new Emp(204,"kunal",40000);
		Emp e4  = new Emp(205,"ajay",50000);
		Emp e5  = new Emp(202,"Rahul",8000);

		Set <Emp> emp = new TreeSet<Emp>();

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		for (Emp ele : emp)
		{
			System.out.println(ele);
		}

	}





}
