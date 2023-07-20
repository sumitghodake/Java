package inheritance;

public class DemoEmp {

	public static void main(String[] args) 
	{
		Emp p =new Emp("Kunal","kunal121@gamil.com",2563,100000.00,11,12,1974);
		p.display();
		System.out.println("========================");
		
		Person p1 =new Emp("Ajay","Ajay@gamil.com",6562,110000.00,12,10,1980);
		p1.display();
		System.out.println("========================");
		
		System.out.println(p);
		System.out.println("========================");
		System.out.println(p1);

	}

}
