package inheritance;

public class Ebook extends Book 
{

	public Ebook() 
	{
		super();
	}
	
	public Ebook(String name, double price) 
	{
		super(name, price);
	}

	@Override
	public void display() 
	{
		super.display();
	}

	@Override
	public double Cal_cost()
	{
		if(price<=500)
		{
			return price - ((price*2)/100);
		}
		else if(price>500 && price<=1000)
		{
			return price - ((price*5)/100);

		}
		else if(price>1000 && price<=5000)
		{
			return price - ((price*7)/100);

		}
		else
		 return price;
	
	}
	
	
  
	
}
