package Program5;

import java.util.Arrays;

class LargestSmallestNumber
{
	public static void main(String[] args)
    {
		int a;
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Array = "+Arrays.toString(arr));
		int count = arr.length;
		for (int i=0; i<count; i++) {
			for (int j=i+1; j<count; j++) {
			      if(arr[i]>arr[j])
                  {
				      a = arr[i];
				      arr[i] = arr[j];
				      arr[j] =a;
                  }
			}
		}
		System.out.println("Smallest two numbers are : "+arr[0]+" , "+arr[1]);
		System.out.println("Largest two numbers are : "+arr[count-1]+" , "+arr[count-2]);
	}
}