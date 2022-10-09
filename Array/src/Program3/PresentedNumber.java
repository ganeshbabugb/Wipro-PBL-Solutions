package Program3;

import java.util.Scanner;

class PresentedNumber
{
    public static void main(String arg[])
    {
    boolean presented = false;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of element : ");
    int total = sc.nextInt();
    int a[] = new int[total];
    System.out.println("Enter the elements : ");
    for(int i=0; i<total; i++)
    {
    a[i]=sc.nextInt();
    }
    System.out.println("Enter the element to check the value : ");
    int check = sc.nextInt();
    int index = 0;
    for(int i=0; i<total; i++)
    {
        if(check==a[i])
        {
        presented=true;
        index = i;
        }
    }
        if(presented)
         {
         System.out.println(check + " is presented in the array at " + index + " position");
         }
        else
         {
         System.out.println(check + " is not presented in the array");
         }
    }
}

