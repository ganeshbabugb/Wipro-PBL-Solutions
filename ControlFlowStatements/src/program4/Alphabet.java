package program4;

import java.util.Scanner;

class Alphabet
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first character : ");
  char c1=sc.next().charAt(0);
  System.out.println("Enter the second character : ");
  char c2=sc.next().charAt(0);
  if(c1>c2)
  {
  System.out.println(c2+","+c1);
  }
  else
  {
  System.out.println(c1+","+c2);
  }
 }
}
