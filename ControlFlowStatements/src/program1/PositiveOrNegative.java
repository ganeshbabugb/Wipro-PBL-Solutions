package program1;

import java.util.Scanner;

class PositiveOrNegative
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        if(num > 0)
        {
            System.out.println(num + " is a positive number");
        }
        else if(num < 0)
        {
            System.out.println(num + " is a negative number");
        }
        else
        {
            System.out.println("It is zero");
        }
    }
}
