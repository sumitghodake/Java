package inheritance;

public class Date {
	
	
	    private int dd;
	    private int mm;
	    private int yy;

	    Date ()
	     {
	        dd=0;
	        mm=0;
	        yy=0;
	     }

	    Date (int dd , int mm , int yy)
	    {
	       this.dd=dd;
	       this.mm=mm;
	       this.yy=yy;

	    }
	    public void showDate()
	        
	        {
	            System.out.println(dd+ "/" +mm+ "/" +yy);

	        }
	  public String toString() 
	  {
		  return dd+ "/" +mm+ "/" +yy;
	  }
	    
	    

}
