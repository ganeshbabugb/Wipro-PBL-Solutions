package program12;

import java.util.Scanner;

class PrimeOrNot
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean prime = true;
            for (int i = 2; i<num; i++)
            {
                if(num%i==0)
                {
                prime = false;
                break;
                }
            }
            if(prime)
            {
                System.out.println(num + " is a prime number");
            }
            else
            {
                System.out.println(num + " is not a prime number");
            }
    }
}
