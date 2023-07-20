package interfacepack;
import java.util.*;
public class Stringmain {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str=sc.next();
		System.out.println("Enter the choice :");
		StringClass t1= new StringClass();
		t1.reverse(str);
		t1.toUppercase(str);
		System.out.println("Length of String "  +str+  ":" +t1.length(str));
		
		if(t1.isPalindrome(str))
		{
			System.out.println("String " +str+ "   is palindrom");
			
		}
		else 
		{
			System.out.println("String " +str+ "  is not palindrom");
		}
		System.out.println("enter the second string");
	    String str1 =sc.next();
	    System.out.println(str+"append"+str1+ ":" +t1.append(str, str1));
	}

}
