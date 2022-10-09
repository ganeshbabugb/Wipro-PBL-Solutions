package program15;

import java.util.Scanner;

class PrintFloyds
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print("* ");
            }
        System.out.println();
        }
    }
}
