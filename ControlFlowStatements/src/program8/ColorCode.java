package program8;

import java.util.Scanner;

class ColorCode
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("RGBOYW");
        System.out.println("Enter your colour choice: ");
        char choice = in.next().charAt(0);
        switch (choice)
        {
           case 'R':
           case 'r':
                System.out.println("Red");
                break;
           case 'G':
           case 'g':
                System.out.println("Green");
                break;
           case 'B':
           case 'b':
                System.out.println("Blue");
                break;
           case 'O':
           case 'o':
                System.out.println("Orange");
                break;
           case 'Y':
           case 'y':
                System.out.println("Yellow");
                break;
           case 'W':
           case 'w':
                System.out.println("White");
                break;
           default:
                System.out.println("Incorrect choice");
        }
    }
}