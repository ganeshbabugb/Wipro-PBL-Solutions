package Program2;

import java.util.Scanner;

class MinAndMax
 {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int elements = sc.nextInt();
    int [] array = new int[elements];
    System.out.print("Enter a numbers : ");
    for(int i = 0; i<elements; i++)
    {
    array[i] = sc.nextInt();
    }
    int max = array[0];
    int min = array[0];
    for(int i = 0; i<elements; i++){
    if(array[i]>max){
    max = array[i];
    }
    if(array[i]<min){
    min = array[i];
    }
    }
    System.out.println("The maximum number is : " + max);
    System.out.println("The minimum number is : " + min);
    }
 }

