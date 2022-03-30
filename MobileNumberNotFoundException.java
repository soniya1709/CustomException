package customexception;

public class MobileNumberNotFoundException  extends Exception {

	public static String message="Mobile number Not found ";
	public MobileNumberNotFoundException()
	{
		this(message);
	}
	public MobileNumberNotFoundException(String message)
	{
		super(message);
	}
	
}
