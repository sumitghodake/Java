package interfacepack;

public class Circle implements Drawable
 {
   private int redius;
   
   

 public Circle()
 {
	super();
	// TODO Auto-generated constructor stub
 }

public Circle(int redius) 
  {
	this.redius = redius;
  }

@Override
public void Drawshape() 
  {
	System.out.println("cricle drawn");
	
  }

@Override
public double Cal_Area()
  {
	
	return PI*redius*redius;
  }

public int getRedius() 
  {
	return redius;
  }

public void setRedius(int redius) 
  {
	this.redius = redius;
  }

   
   
 }
