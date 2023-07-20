package collectionframework1;
import java.util.*;
public class Demo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//		List<Customer> c = new ArrayList<>(10);
		//		List<RegCustomer> rc= new ArrayList<>(10);
		Customer [] cust = new Customer[10];
		String name;
		String emailid;
		long contactNo;
		int regno;
		int ch=0;
		for(int i = 0 ; i<cust.length; i++)
		{
			System.out.println("1.Create Object of Customer deatials :");
			System.out.println("2.Create Object of RregCustomer deatials :");
			//			System.out.println("3.Display Customer:");
			//			System.out.println("4.Display RegCustomer :");
			//			System.out.println("0.Exits :");

			System.out.println("Enter your Choices :");
			ch =sc.nextInt();

			switch(ch)
			{
			case 1 :

				System.out.println("Enter name : ");
				name=sc.next();
				System.out.println("Enter email : ");
				emailid=sc.next();
				System.out.println("Enter Contact No : ");
				contactNo=sc.nextLong();

				cust[i]=new Customer(name,emailid,contactNo);
				break;

			case 2 :
				System.out.println("Enter name : ");
				name=sc.next();
				System.out.println("Enter email : ");
				emailid=sc.next();
				System.out.println("Enter Contact No : ");
				contactNo=sc.nextLong();
				System.out.println("Enter the reg Number :");
				regno = sc.nextInt();

                // RegCustmoer r1=new RegCustomer(name,emailid,contactNo,regNo);

				cust[i]=new RegCustomer(name,emailid,contactNo,regno);
				break;

			}






		}

	}

}
