package interfacepack;

public class Merit implements Comparer {

	@Override
	public int comparer(Object p1, Object p2)
	{
		Student s1=(Student) p1;
		Student s2=(Student) p2;
		if (s1.getMarks()>s2.getMarks())
			return 1;
		else if (s1.getMarks()<s2.getMarks())
			return -1;
		else
		return 0;
	}

}
