package collectionframework1;

public class RegCustomer extends Customer 
{
	private int regno ;

	public RegCustomer(String name, String emailid, long contactNo, int regno) 
	{
		super(name, emailid, contactNo);
		
		this.regno = regno;
	}
	

	public int getRegno()
	{
		return regno;
	}


	public void setRegno(int regno)
	{
		this.regno = regno;
	}


	@Override
	public String toString() 
	{
		return super.toString()+"regNo=" + regno ;
	}
	
	

}
