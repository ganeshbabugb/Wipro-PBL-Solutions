package programs.program4;

public class UserRegistration 
{	
		public void registerUser(String username, String userCountry) throws InvalidCountryException 
		{
			if (!userCountry.equals("India"))
				throw new InvalidCountryException();
			else
				System.out.println("User registration done successfully");
		}
		
		public static void main(String args[])
		{
			UserRegistration registration = new UserRegistration();
			
			try 
			{
				registration.registerUser("Mickey", "India");
			} 
			catch (InvalidCountryException e) 
			{
				
			}
		}
}
