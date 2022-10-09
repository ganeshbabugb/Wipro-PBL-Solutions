package program14;

import java.util.Scanner;

class SumOfDigits
 {
    public static void main(String arg[])
    {
    int number, sum;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    number=sc.nextInt();
        for(sum=0; number!=0; number=number/10)
        {
        sum = sum + number % 10;
        }
    System.out.println("Sum of digits: "+sum);
    }
 }
