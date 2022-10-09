package Package14;

import java.util.Scanner;
class FindTheBiggestValue {

    final static int N = 3;
    final static int  M = 3 ;

    static int findMax(int mat[][])
    {

        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] > maxElement) {
                    maxElement = mat[i][j];
                }
            }
        }
        return maxElement;
    }
    public static void main(String args[])
    {
   int i, j;
    int mat[][] = new int[10][10];
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter 9 integer numbers :\n");
    for (i = 0; i < N; i++)
    {
      for (j = 0; j < M; j++)
      {
        mat[i][j]=sc.nextInt();
      }
    }
    System.out.print("The given array is :\n");
    for (i = 0; i < N; i++)
    {
      for (j = 0; j < M; j++)
      {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("The biggest number is : " + findMax(mat));
    }
}

