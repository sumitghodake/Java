package inheritance;



public class Regcustomer extends Customer
{
	private int regno;

	public Regcustomer()
	{
		
	}

	public Regcustomer(String email, String area, int pincode, int regno) {
		super(email, area, pincode);
		this.regno = regno;
	}

	public void display()
	{
		super.display();
		System.out.println("Regno :"+regno);
		
	}
	public double givedisc(double price)
	{
		return price - price*5/100;
	}
	public String toString() 
	{
		return super.toString()+"\nreg no:"+regno+"\n Price :"+givedisc(200.00);
	}

}
