package collectionframework1;

public class Customer 
{
	private String name;
	private String emailid;
	private long contactNo;

	public Customer(String name, String emailid, long contactNo) 
	{
		super();
		this.name = name;
		this.emailid = emailid;
		this.contactNo = contactNo;
	}


	public String getName()
	{
		return name;
	}


	public String getEmailid() 
	{
		return emailid;
	}


	public long getContactNo()
	{
		return contactNo;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public void setEmailid(String emailid) 
	{
		this.emailid = emailid;
	}


	public void setContactNo(long contactNo) 
	{
		this.contactNo = contactNo;
	}


	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", emailid=" + emailid + ", contactNo=" + contactNo + "]";
	}



}
