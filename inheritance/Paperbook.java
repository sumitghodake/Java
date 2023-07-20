package inheritance;

public class Paperbook extends Book

{

	public Paperbook()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Paperbook(String name, double price)
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	
	public void display() 
	{
		
		super.display();
	}

	
	public double Cal_cost() 
	{
		if(price<=500)
		{
			return price + ((price*7)/100);
		}
		else if(price>500 && price<=1000)
		{
			return price + ((price*5)/100);

		}
		else if(price>1000 && price<=5000)
		{
			return price + ((price*2)/100);

		}
		else
		 return price;
	
		
		
	}
	
	

}
