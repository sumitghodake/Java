package inheritance;

public class Customer 
{
    private String email;
    public Address address;
    
	public Customer()
	{
		
	}

	public Customer(String email, String area, int pincode) 
	{
		
		this.email = email;
		this.address = new Address(area,pincode);
	}
	
	public void display()
	{  
		 address.display();
		 System.out.println("Email :"+email);
		
	}
	public double givedisc(double price)
	{
		return price;
	}
    
	public String toString() 
	{
		return address+"\nemail:"+email;
	}

	
	
    
    
}
