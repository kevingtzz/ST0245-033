
/**
 * Laboratorio 1 de Estructuras de Datos 1
 *
 * @author Mauricio Toro
 * @version 1
 */

import java.util.Arrays;
import java.util.Random;

public class Laboratory1
{

  public static int[] ArrayGenerator(int len) {
    Random ran = new Random();
    int[] arr = new int[len];
    for (int i = 0; i < len; ++i) {
      arr[i] = ran.nextInt(100);
    }
    return arr;
  }

  // Computer the sum of an array
  public static int ArraySum(int[] A)
  {
      int sum = 0;
      for (int i = 0; i < A.length; i++)
         sum = sum + A[i];
      return sum;
  }

  private static int R_ArraySum(int[]A) {
    return R_ArraySum_aux(A,0,0);
  }

  public static int R_ArraySum_aux(int[] A, int i, int sum) {
    if (i >= A.length) return sum;
    sum += A[i];
    return R_ArraySum_aux(A, i+1, sum);
  }

  // Computes the maximum value of an array
  public static int ArrayMax(int[] A)
  {
      int max = A[0];
      for (int i = 0; i < A.length; i++)
         if (A[i] > max)
           max = A[i];
      return max;
  }

  private static int R_ArrayMax_aux(int[] A, int i, int max) {
    if (i >= A.length) return max;
    if (A[i] > max) max = A[i];
    return R_ArrayMax_aux(A, i+1, max);
  }

  public static int R_ArrayMax(int[] A) {
    return R_ArrayMax_aux(A, 0, 0);
  }

  public static int R_Fibonacci(int n) {
    if (n <= 1) return n;
    return R_Fibonacci(n-2) + R_Fibonacci(n-1);
  }

  // Sorts an array using Insertion Sort
  public static void InsertionSort(int[] A)
  {
       int temp,j;
       for (int i = 0; i < A.length; i++)
       {
         j = i;
         while (j > 0 && A[j-1] > A[j])
           {
               temp = A[j];
               A[j] = A[j-1];
               A[j-1] = temp;
               j = j-1;
            }
       }
       System.out.println(Arrays.toString(A));
  }

      // Sorts an array using Merge Sort
      // Taken from www.cs.cmu.edu/
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

  public static void main(String[] args)
  {
      /*int[] A = {1,5,3,2,6};
      int[] B = {1,5,3,2};
      int[] C = {1,5,2,6};
      int[][] Arrays = {A,B,C};
      for (int[] X : Arrays)
      {
      Laboratory1.mergeSort(X);
      Laboratory1.InsertionSort(X);
      System.out.println(Laboratory1.ArraySum(X) + " " + Laboratory1.ArrayMax(X) + "\n" );
      */
      int uno = 100000;
      int dos = 1000000;
      int tres = 10000000;
      int cuatro = 100000000;
      int[] array = Laboratory1.ArrayGenerator(cuatro);
      /*for (int i = 0; i < array.length; ++i) {
        System.out.print(array[i]);
      }*/

      long init = System.currentTimeMillis();
      Laboratory1.mergeSort(array);
      long time = System.currentTimeMillis() - init;
      System.out.println("Time: " + time);
    }
}
