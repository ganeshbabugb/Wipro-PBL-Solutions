package program17;

import java.util.Scanner;

class Palindrome
{
 public static void main(String args[])
 {
  int remainder,sum=0,temp;
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number : ");
  int n=sc.nextInt();
  temp=n;
  while(n>0)
  {
   remainder=n%10;
   sum=(sum*10)+remainder;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome number ");
  else
   System.out.println("not palindrome");
 }
}
