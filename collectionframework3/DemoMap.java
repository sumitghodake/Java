package collectionframework3;
import java.util.*;

public class DemoMap 
{
	public static void main(String[] args) 
	{
		Map<Integer ,String > Str = new HashMap();
        Str.put(10,"java");
        Str.put(20, "CAD");
        Str.put(30, "Math-2");
        Str.put(40, "Som");
        Str.put(50, null);
        Str.put(null, null);
        Str.put(null,"Chemistry");
        
        System.out.println(Str);
	}
}
