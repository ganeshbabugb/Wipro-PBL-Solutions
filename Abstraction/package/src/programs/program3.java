package programs;

import com.automobile.Honda;
import com.automobile.twowheeler.Hero;

public class program3 
{
	public static void main(String args[]) 
	{
		Hero hero = new Hero("Glamour 125", "TN306725", "Ganesh", 95);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "TN02528", "Naveen", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();
	}
}