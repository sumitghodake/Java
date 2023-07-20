package interfacepack;

public class Rectangle implements Drawable 
{
  private int length , breath;
  
 public Rectangle() 
 {
 }

 public Rectangle(int length, int breath)
  {
	super();
	this.length = length;
	this.breath = breath;
  }
 public void Drawshape()
  {
	 System.out.println("Draw Rectangle");
  }

@Override
 public double Cal_Area() 
   {
	return length*breath;
   }

public int getLength() 
{
	return length;
}

public void setLength(int length)
{
	this.length = length;
}

public int getBreath() 
{
	return breath;
}

public void setBreath(int breath)
{
	this.breath = breath;
}
 
  
  
}
