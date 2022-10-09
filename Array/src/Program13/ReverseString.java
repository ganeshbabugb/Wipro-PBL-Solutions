package Program13;

import java.util.Scanner;

class ReverseString
{
    public static void main(String args[])
    {
    int i;
    int arr[][] = new int[4][4];

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the integer numbers :\n");
    for ( i = 0; i < 2; i++)
    {
      for (int j = 0; j < 2; j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }

    System.out.println("The given array is:");
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();

    }
    System.out.println("The reverse of array is:");
    for(i=1;i>=0;i--)
    {
        for(int j=1;j>=0;j--)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}
