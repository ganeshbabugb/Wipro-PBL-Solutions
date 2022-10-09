package program3;

class CommandLineArgument
{
  public static void main (String args[])
  {
   int num = args.length;
    if (num==0)
    {
    System.out.println("No values");
    }
    else
    {
      for(int i=0;i<num;i++)
      {
      System.out.print(","+ args[i]);
      }
    }
  }
}