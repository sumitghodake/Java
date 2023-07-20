package interfacepack;

public class Numbermain {

	public static void main(String[] args) 
	{
		Operationmethod m = new Mynumber();
	   
		System.out.println( m.isoddnum(23));
		System.out.println( m.isevennum(20));
		System.out.println( m.isprimenum(11));
		System.out.println(m.calfactorial(5));

	}

}
