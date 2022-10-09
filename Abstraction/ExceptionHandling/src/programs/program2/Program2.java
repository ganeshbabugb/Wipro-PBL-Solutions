package programs.program2;

import java.util.*;

public class Program2 
{
	public static void main(String args[])
	{
			int n = args.length;
			
			int sum = 0;
			double avg = 0;
			
			for (int i = 0; i < n; i++)
				if (args[i].charAt(args[i].length() - 1) == ',') 
					args[i] = args[i].replace(",", "");
			
			int[] arr = new int[n];

			try {
				for (int i = 0; i < n; i++)
					arr[i] = Integer.parseInt(args[i]);
				
				for (int i = 0; i < n; i++)
				{
					sum = sum + arr[i];
				}
				
				avg = sum / n;
				
			} catch (NumberFormatException e) {
				System.out.println("NumberFormatException");
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException");
			}
			
			System.out.println("sum: " + sum);
			System.out.println("avg: " + avg);
	}
}
