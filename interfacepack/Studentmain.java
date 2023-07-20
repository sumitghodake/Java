package interfacepack;

import java.util.*;
public class Studentmain 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		Student [] std = new Student[6];
		
		std [0]= new Student(114,"Yohan",95);
		std [1]= new Student(66,"Anmol",85);
		std [2]= new Student(92,"Dhanjay",60);
		std [3]= new Student(62,"Nikhil",60);
		std [4]= new Student(43,"Ajay",80);
		std [5]= new Student(13,"Kunal",45);
		
		
		
		 System.out.println("Enter the choice :");
		 System.out.println("1.Sort by Roll number");
		 System.out.println("2.Sort by merit");
		 System.out.println("3.Sort by name");
		 int ch=sc.nextInt();
		 
		 if(ch==1)
		 {
			 Comparer c= new Rollnocomparer();
			 for(int i=0;i<std.length;i++)
				{
					for(int j=i+1;j<std.length;j++)
					{
						if(c.comparer(std[i],std[j]) > 0)
						{
							Student temp=std[i];
							std [i]=std[j];
							std[j]=temp;
						}
						
					}
				}
			 for(int i=0;i<std.length;i++)
			 {
				 System.out.println(std[i]);
			 }
			System.out.println("*******Rollnumber Sort*******"); 
		 }
		 else if(ch==2)
		 {
			 Comparer C1 = new Merit();
			 for(int i=0;i<std.length;i++)
				{
					for(int j=i+1;j<std.length;j++)
					{
						if(C1.comparer(std[i],std[j])>0)
						{
							Student temp=std[i];
							std [i]=std[j];
							std[j]=temp;
						}
						
					}
					
				}
			 for(int i=0;i<std.length;i++)
			 {
				 System.out.println(std[i]);
			 }
			 System.out.println("*******Merit sort********");
		 }
		 else if(ch==3)
		 {
			 Comparer C2 = new Namecomparer();
			 
			 for(int i=0;i<std.length;i++)
				{
					for(int j=i+1;j<std.length;j++)
					
					{
						if(C2.comparer(std[i],std[j])>0)
						{
							Student temp=std[i];
							std [i]=std[j];
							std[j]=temp;
						}
						
					}
				}
			 for(int i=0;i<std.length;i++)
			 {
				 System.out.println(std[i]);
			 }
			 System.out.println("*********Name Comparer sort***********");
		 }
		 
		
		
		
		
		
		
	}	
}
		
		
		
		

