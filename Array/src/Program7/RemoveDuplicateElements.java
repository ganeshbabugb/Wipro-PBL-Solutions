package Program7;

class RemoveDuplicateElements {
    public static int removeDuplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }

    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6 };
        System.out.print("Elements of array elements : ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        int n = a.length;
        int j=0;
        j = removeDuplicates(a, n);
        System.out.println();
        System.out.print("Elements in the new array : ");
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
}

