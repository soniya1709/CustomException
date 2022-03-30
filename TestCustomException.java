package customexception;

public class TestCustomException {
public static void main(String[] args) {
	try
	{
		isvalidmobilenumber("61637371");
	}
	catch(MobileNumberNotFoundException e)
	{
		System.out.println("MobileNumberNotFoundException");
		e.printStackTrace();
	}
}
public static boolean isvalidmobilenumber(String  num) throws MobileNumberNotFoundException
{
	if(num.length()==10)
	{
		return true;
	}
	else
	{
		throw new MobileNumberNotFoundException();
	}
}
}
