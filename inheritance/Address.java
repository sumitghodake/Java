package inheritance;

public class Address 
{
  private String area;
  private int pincode;
  
  
  public Address()
  {
	
  }


  public Address(String area, int pincode)
   {
	
	this.area = area;
	this.pincode = pincode;
	
   }
  public void display()
  {
	  System.out.println("Area :"+area);
	  System.out.println("Pncode :"+pincode);
	  
  }
  public String toString()
  {
	return "Area :" +area+"\nPincode :"+pincode;  
  }
  
	
	
	

}
