package inheritance;

import java.io.Serializable;

public class Emp extends Person implements Serializable
{
	private int empid ;
	protected double salary;
	
	public Emp() 
	{
		this.empid=0;
		this.salary=0;
	}


	public Emp(String name, String email, int empid, double salary,int dd,int mm , int yy)
	{
		super(name,email,dd,mm,yy);
		this.empid = empid;
		this.salary = salary;
	
	}
   public void display()
   {
	   super.display();
	   System.out.println("empid :"+empid);
	   System.out.println("Salary :"+salary);
	   
   }
   public String toString()
   {
	   return super.toString()+"\nEmpid :"+empid +"\nSalary :"+salary;
	   
   }
  public double calSalary()
  {
	  return salary;
  }
   /*Scanner sc= new Scanner (System.in);
	i =sc.nextInt();
	
	System.out.println("Enter Email :");
	String email= sc.next();
	
	System.out.println("Enter Area :");
	String area = sc.next();
	
	
	
	System.out.println("Enter pincode :");
	int  pincode= sc.nextInt();
	
	if(i==1)
	{
		c = new Customer(email,area,pincode);
	}
	
	
	if (i==2)
	{
		System.out.println("Enter regno :");
		int regno = sc.nextInt();
		c = new Regcustomer(email,area, pincode,regno );
	}
	
	System.out.println("Enter Shopping Price :");
	
	double pr = sc.nextDouble();
	
	c.display();
	System.out.println("Final Price :"+c.Givedisc(pr));
	
	
	


*/
}
