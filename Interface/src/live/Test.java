package live;

import music.Playable;
import music.string.*;
import music.wind.*;

public class Test 
{
	public static void main(String args[])
	{
		Veena v = new Veena();
		Saxoephone s = new Saxoephone();
		v.play();
		s.play();
	}
}
