package interfacepack;

public class Student  
{
    private int roll_no;
    private String name;
    private int marks;
    
	public Student() 
	{
		
	}

	public Student(int roll_no, String name, int marks) 
	{
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}



	public int getRoll_no() 
	{
		return roll_no;
	}

	public String getName() 
	{
		return name;
	}

	public int getMarks() 
	{
		return marks;
	}

	@Override
	public String toString() 
	{
		return " "+roll_no+"  "+name+" "
				+ " "+marks;
	}
      
}
