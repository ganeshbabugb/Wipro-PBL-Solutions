package Package12;

class MiddleValueOfArray
{
    public static void main(String args[])
    {
    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};
    int[] newArr = new int[2];
    newArr[0] = a[1];
    newArr[1] = b[1];
    System.out.println("middleWay([1, 2, 3],[4, 5, 6]) -> " + newArr[0]+ "," + newArr[1]);
    }
}
