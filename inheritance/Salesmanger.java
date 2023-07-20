package inheritance;
import java.io.Serializable;

import interfacepack.ITraveller;
public class Salesmanger extends Emp implements ITraveller ,Serializable
{
  
	private int target;
	private double incentive;
	private double a;
	private int days_Traveller;
	public Salesmanger()
	{
		
		
	}
	public Salesmanger(String name, String email, int empid, double salary, int dd, int mm, int yy, int target,
			double incentive,int days_Traveller) {
		super(name, email, empid, salary, dd, mm, yy);
		this.target = target;
		this.incentive = incentive;
		this.days_Traveller=days_Traveller;
		
	}
	public void display()
	{
		super.display();
		System.out.println("Target :"+target);
		System.out.println("Incentive :"+incentive);
		System.out.println("Day traveller :"+days_Traveller);
	}
	
	
	@Override
	public double cal_TA() {
		
		return (calSalary()*TA/100)*days_Traveller;
	}
	public double calSalary()
	{
		return super.calSalary()+((incentive)*(target/1000));
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\n Target :"+target +"\n Incentive :"+incentive;
	}
	
}
