package interfacepack;

public class Rollnocomparer implements Comparer 
{

	@Override
	public int comparer(Object p1, Object p2) 
	{
		Student s1 =(Student)p1;
		Student s2=(Student)p2;
		
		 if( s1.getRoll_no( ) > s2.getRoll_no())
		    return 1;
		 else if (s1.getRoll_no() < s2.getRoll_no())
		    return -1;
		  else
		    return 0;
		
	}

}
