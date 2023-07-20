package inheritance;

public class Person 
{
	private String name;
    private String email;
    public Date bdate;

	
	
	public Person()
	{
		this.name="";
		this.email="";
		this.bdate=new Date();
				
	}


	public Person(String name2, String email2, int dd, int mm, int yy)
	{
		this.name = name;
		this.email=email;
		this.bdate=new Date(dd,mm,yy);
	}
	public void display()
	{
		System.out.println("Name :" +name);
		System.out.println("Email :"+email);
		bdate.showDate();	
	}
	
    public String toString()
	    {
	    	return "Name :"+name+"\nbirthadte :"+bdate+"\nEmail :"+email;
	    }

}
