package collectionframework2;
import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(101,"Sumit","Latur",82);
		Student s2 = new Student(102,"yogi","Jewali",77.89f);
		Student s3 = new Student(103,"Rohit","Solapur",69.78f);
		Student s4 = new Student (104,"Aditya","Pune",85);
		Student s5 =new Student (103,"Siddha","Solapur",79);
		
		Set<Student> Stud=new HashSet<>();
		
		Stud.add(s1);
		Stud.add(s2);
		Stud.add(s3);
		Stud.add(s4);
		Stud.add(s5);
		
		System.out.println("HashCode :"+Stud.hashCode());
		
		System.out.println("-----------For each loop--------------");
		
		for(Student ele : Stud)
		{
			System.out.println(ele);
		}
		
		
	}

}
