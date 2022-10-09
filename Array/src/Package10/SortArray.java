package Package10;

import java.io.*;
import java.util.Scanner;

class SortArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n;
        int count = 0,temp = 0;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        int newArr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
               if(arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
            newArr[count]=arr[i];
            count++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
            newArr[count]=arr[i];
            count++;
            }
        }
        System.out.print("The order is : ");
        for(int i=0;i<n;i++)
        {
        System.out.print(newArr[i] + " ");
        }
    }
}
