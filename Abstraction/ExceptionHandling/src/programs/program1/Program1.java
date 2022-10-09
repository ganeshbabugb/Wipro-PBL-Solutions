package programs.program1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1
{
	public static void main(String args[]) 
	{
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number of elements in the array: ");
			int n = sc.nextInt();
			
			int[] ar = new int[n];
			
			System.out.println("Enter the elements in the array: ");
			
			for (int i = 0; i < n; i++)
				ar[i] = sc.nextInt();
			
			System.out.println("Enter the index of the array element you want to access");
			
			int index = sc.nextInt();
			
			try {
				
				System.out.println("The array element at index " + index + " = " + ar[index]);
				System.out.println("The array element successfully accessed");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("java.lang.ArrayIndexOutOfBoundsException");
				
			} catch (InputMismatchException e) {
				
			System.out.println("jaca.lang.NumberFormatException");
			
			}
	}
}

