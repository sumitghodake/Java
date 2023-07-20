package inheritance;
import java.io.Serializable;

import interfacepack.ITraveller;
public class Programmer extends Emp implements ITraveller,Serializable
{
   private int extra_per_hour;
   private double chargesPerHour;
   private int days_Traveller;
public Programmer()
{
	
}
public Programmer(String name, String email, int empid, double salary, int dd, int mm, int yy, int extra_per_hour,
		double chargesPerHour,int days_Traveller) 
{
	super(name, email, empid, salary, dd, mm, yy);
	this.extra_per_hour = extra_per_hour;
	this.chargesPerHour = chargesPerHour;
	this.days_Traveller=days_Traveller;
}

 public void display()
 {
	 super.display();
	 System.out.println("Extra per hour :"+extra_per_hour);
	 System.out.println("Charges per hour :"+chargesPerHour);
	 System.out.println("Days Traveller :"+days_Traveller);
	 
 }
 
 
 public double calSalary()
 {
	 return super.calSalary()+(extra_per_hour*chargesPerHour);
 }
 
 public double cal_TA()
 {
	 return (calSalary()*TA/100)*days_Traveller;
 }
 
@Override
public String toString() 
{
	
	return super.toString() +"\nExtra per hour :"+extra_per_hour +"\nCharges per hour :"+chargesPerHour;
}
 
   
   
}
