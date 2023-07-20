package interfacepack;

public class Drawablemain {

	public static void main(String[] args)
	{
		Drawable d []= { new Rectangle(5,6), new Circle(9)};
		
		for (int i=0;i<d.length;i++)
		{
			d[i].Drawshape();
			System.out.println(d[i].Cal_Area());
			
			
		    if (d[i] instanceof Rectangle)
		    {
		    	System.out.println(((Rectangle)d[i]).getBreath());
		    }
		}
	}

}
