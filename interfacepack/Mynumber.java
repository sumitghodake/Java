package interfacepack;

public class Mynumber implements Operationmethod 
{
   private int num;

public Mynumber() 
 {
	
 }

public Mynumber(int num) 
 {
	super();
	this.num = num;
 }

@Override
public boolean isoddnum(int num)
{
	if(num%2==1)
	  return true;
	else
		return false;
}

@Override
public boolean isevennum(int num) 
{
	if  (num%2==0)
		return true;
	else
	  return false;
}

@Override
public boolean isprimenum(int num) 
{
	for(int i=2;i<num;i++)
{
	if(num%i==0)
		return false;
	
}
	return true;
}

@Override
public double calfactorial(int num) 
{
	int i=num;
	double fact=1;
	while (i>0)
	{
		
		fact=fact*i;
		i--;

		

	}
	return fact;
}
   
   
   
}
