package collectionframework1;
import java.util.*;

public class AssignmentQ1 
{
	public static void main(String[] args)
	{
		int index=0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String>words= new ArrayList<>();
		System.out.println("----------------Enter the value of collection ----------------------");
		System.out.println("Enter the words ");

		while(true)
		{
			String str =sc.nextLine();
			if(str.equalsIgnoreCase("quit"))
				break;
			words.add(str);
		}
		System.out.println("Print words");
		System.out.println(words);
		System.out.println("----------------------------------------------");


		System.out.println("Display string for each loop ");

		for(String k :words)
		{
			System.out.println(k);
		}



		System.out.println("-------------Removing string----------------");
		System.out.println("Enter the Index");
		index =sc.nextInt();
		words.remove(index);
		System.out.println(words);
		


		System.out.println("--------------Get the Element----------------");
		System.out.println("Enter the index");
		index=sc.nextInt();
		System.out.println(words.get(index));
		





		System.out.println("--------------Sorting the string-------------------");
		Collections.sort(words);
		words.forEach(k-> System.out.println(k));
		System.out.println("---------------------------------------------------");

		System.out.println("-----------------Size of String--------------------");
		words.forEach(k->System.out.println(k+  ":" +k.length()));
		


		System.out.println("----------------Iterate the String-----------------");

		Iterator <String> i=words.iterator();
		while(i.hasNext())
			System.out.println(i.next());



		System.out.println("--------------Reverse the String--------------------");

		ListIterator<String> Li = words.listIterator(words.size());
		while(Li.hasPrevious())
			System.out.println(Li.previous());

		



	}

}
