package program7;

import java.util.Scanner;

class LowerUpperCase
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int ascii;
		if(c>='a'&&c<='z')
        {
		System.out.println(c+"->");
		ascii=(int)c;
		c=(char)(ascii-32);
		System.out.println(c);
		}
		else
        {
		System.out.println(c+"->");
		ascii=(int)c;
		c=(char)(ascii+32);
		System.out.println(c);
		}
	}
}
