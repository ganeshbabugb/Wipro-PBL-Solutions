package Package11;

import java. util.Scanner;

class TrueFalse
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in) ;
    int i, k=0;
    System.out.print("Enter the no of element : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the aray elements : ");
    for ( i=0;i<a.length;i++)
    {
    a [i] = sc.nextInt();
    }
    System.out.println("The array elements are : ");
    for ( i=0;i<a.length;i++)
    {
    System.out.println ( a[ i ] + " " ) ;
    }
    for ( i=0;i<a.length;i++)
    {
    if ( a [ i ] == 1 || a [ i ] == 4 )
    k++;
    }
    if ( k == a.length )
    System.out.println ("True");
    else
    System.out.println ("False");
    }
}