package Program10;

public class PrintNCharOfString 
{
    public static void main(String args[]) 
    {
        String a = "wipro";
        String c="";
        int len=a.length();
        int b=3;
        len=len-b;
        for(int i= 0;i<b;i++)
        {
            c=c+a.substring(len);
        }
        System.out.println(c);
    }
}
