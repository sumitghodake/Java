package interfacepack;

public class StringClass implements StringOperation 
{

	@Override
	public void reverse(String str)
	{
		String str1="";
		for(int i=(str.length()-1);i>=0;i--)
		{
			char ch =str.charAt(i);
			str1=str1+ch;
			
		}
		System.out.println("Reverse of " +str+ "is"  +str1);

	}

	@Override
	public void toUppercase(String str) 
	{
		String str1="";
		
		for(int i=0;i<str.length();i++)
		{
			int ch =str.charAt(i);
			if(ch>=97 && ch<=122)
			{
				ch =ch-32;
			}
			str1 +=(char)ch;
		}
		System.out.println("Lower to upper case "+str+":"+str1);
	}

	@Override
	public int length(String str) 
	{
		int l =str.length();
		return 1;

	}

	@Override
	public boolean isPalindrome(String str) 
	{
		String str1="";
		boolean f=true;
		int j =0;
		for(int i=str.length()-1;i>=0;i--)
		{
			
			if(str.charAt(i)!=str.charAt(j))
				f=false;
			j++;
				
		}
		
		return f;
	}

	@Override
	public String append(String str1, String str2) 
	{
		str1+=str2;
		return str1;
	}

}
