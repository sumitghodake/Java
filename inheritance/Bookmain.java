package inheritance;
import java.util.Scanner;
public class Bookmain 
{
 
	public static void main(String[] args) 
	{
		Book b1[] = new Book[5];
		int a;
		String name;
		double price;
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<b1.length;i++)
		{
			System.out.println("Enter your choice :");
			System.out.println("1 . Ebook ");
			System.out.println("2 . Paperbook ");
			
			
			
			a= sc.nextInt();
			if(a==1)
			{
				System.out.println("enter ebook name :");
				name = sc.next();
				
				System.out.println("enter ebook price :");
				price = sc.nextDouble();
				
				b1 [i]= new Ebook(name, price);
				b1 [i].display();
				System.out.println(b1[i].Cal_cost());
				

			}
			if(a==2)
			{
				System.out.println("enter paperbook name :");
				name = sc.next();
				
				System.out.println("enter peperbook price :");
				price = sc.nextDouble();
				b1 [i]= new Paperbook(name, price);
				b1 [i].display();
				System.out.println(b1[i].Cal_cost());
				
			}
			
		}

	}

}
