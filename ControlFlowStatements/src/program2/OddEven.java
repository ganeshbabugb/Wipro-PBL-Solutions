package program2;

import java.util.Scanner;

class OddEven
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        num = sc.nextInt();
        if((num%2)== 0)
        {
            System.out.println(num + " is a even number");
        }
        else
        {
            System.out.println(num + " is a odd number");
        }
    }
}
