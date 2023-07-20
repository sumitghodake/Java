package inheritance;

import interfacepack.ITraveller;

public class Mainemp {

	public static void main(String[] args)
	{
		Emp [] s1= new Salesmanger[3];
		Emp [] p1= new Programmer [3];
		
		 s1[0]= new Salesmanger("Anmole","anmol122@gmail.com" , 1235,100000.00,24,04,1999,0,0,5);
		 s1[1]= new Salesmanger("Anmole","anmol122@gmail.com" , 1235,100000.00,24,04,1999,800,500.00,25);
		 s1[2]= new Salesmanger("Anmole","anmol122@gmail.com" , 1235,100000.00,24,04,1999,1500,500.00,78);
		 
		 
		 p1[0]= new Programmer("king", "king123@gmail.com", 101, 250000, 24, 12, 1999, 4, 1000,7);
		 p1[1]= new Programmer("Tanvi", "Tanvi24@gmail.com", 1227, 200000, 27, 03, 1999, 0, 1000,6);
		 p1[2]= new Programmer("xyz", "xyz@gmil.com", 544, 28000, 13, 10, 1990, 5, 500,4);
		
		 for(int i=0;i<s1.length;i++) 
		 {
			 System.out.println(s1[i]);
			 System.out.println("Total Salary :"+s1[i].calSalary());
			 if (s1[i] instanceof ITraveller )
			 {
				 System.out.println("travelling allowance :"+((Salesmanger)s1[i]).cal_TA());
				 
			 }
		 }
		 
		 System.out.println("*********************************");
		 
		 
		 for(int i=0;i<p1.length;i++)
		 {
			 System.out.println(p1[i]); 
			 System.out.println("Total Salary :"+p1[i].calSalary()); 
			 if (p1[i] instanceof ITraveller )
			 {
				 System.out.println("travelling allowance :"+((Programmer)p1[i]).cal_TA());
				 
			 }
			
		 }
	}

}
