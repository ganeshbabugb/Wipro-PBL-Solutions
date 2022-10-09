package programs;

import com.automobile.FourWheeler.Ford;
import com.automobile.FourWheeler.Logan;

public class program4 
{
	public static void main(String[] args) 
	{
		Logan logan = new Logan("Logan XYZ", "TN28250", "Deepika", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.speed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Mustang GT", "TN30220", "Gayathri", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? " + ford.tempControl());
	}
}