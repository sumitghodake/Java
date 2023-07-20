package inheritance;

public abstract class Book
{
	private String name;
	private int bookid;
	protected double price;
	private static int count;
	
	static
	{
		count=0;
		
		
	}
	
	public Book()
	{
		name =null;
		bookid=++count;
		price=0.0;
	}

	public Book(String name, double price)
	{
		
		this.name = name;
		this.bookid = ++count;
		this.price = price;
	}
	
	public void display() 
	{
		System.out.println("Name of Book :"+name);
		System.out.println("Bookid :"+bookid);
		System.out.println("Price of Book :"+price);
	}
	public abstract double Cal_cost();
	
	//public abstract double deliverycharges();
	
}
