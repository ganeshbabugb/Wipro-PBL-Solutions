package program16;

import java.util.Scanner;

class ReverseNumber
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int number, reverse = 0;
      System.out.print("Enter the number : ");
      number = sc.nextInt();
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
       System.out.println("The reverse of the given number is: " + reverse);
    }
}
