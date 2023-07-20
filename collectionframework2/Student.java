package collectionframework2;

import java.util.Objects;

public class Student 
{
	private int studentid ;
	private String name;
	private String city;
	private float percent;

	public Student(int studentid, String name, String city, float percent) 
	{
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percent = percent;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	@Override
	public String toString() 
	{
		return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + ", percent=" + percent + "]";
	}


	public int hashCode()
	{
		int hcode = 0;

		if(city.equalsIgnoreCase("pune"))
			hcode=10;
		else if(city.equalsIgnoreCase("Solapur"))
			hcode=20;
		else if(city.equalsIgnoreCase("Latur"))
			hcode=30;
		else if(city.equalsIgnoreCase("Jewali"))
			hcode = 40;
		else if(city.equalsIgnoreCase("Jewali"))
			hcode =50;
		else 
			hcode = 60;
		return hcode;
	}


	public boolean equals(Object obj) 
	{
		boolean F = false ;

		Student S = null;

		if(obj instanceof Student)
		{
			S = (Student)obj;

			if(this.studentid ==S.studentid)
			{
				
				if(this.city.equals(S.city))
				{
				F = true;
			}
				
				
			}

		}
		return F;

	}





}
