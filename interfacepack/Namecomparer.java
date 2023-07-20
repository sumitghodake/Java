package interfacepack;

public class Namecomparer implements Comparer 
{

	@Override
	public int comparer(Object p1, Object p2) 
	{
		Student s1 = (Student) p1;
		Student s2 = (Student) p2;
		
		return (s1.getName().compareTo(s2.getName()));
		
	}

}
