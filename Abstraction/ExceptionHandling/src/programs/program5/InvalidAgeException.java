package programs.program5;

public class InvalidAgeException extends Exception 
{
	public InvalidAgeException() 
	{
		super();
		System.out.println("Invalid age Exception");
	}
}