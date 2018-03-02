import java.util.Random;
import java.math.BigInteger;

/**lab01 class declaration.
*@author Kevin Gutierrez Gomez
*@author Jose Villamizar
*@version 3.0
*@since taller04 1.2.0
*/

public class lab02 {

/**
*This function generates an array with n random values.
*@param Requires an int n that will be the length of the desired array
*@return Array length n with random values inside.
*/
public static int[] array_generator(int n) {
    int[] arr = new int[n];
    Random ran = new Random();
    for (int i = 0; i < n; ++i) {
        arr[i] = ran.nextInt(10);
    }
    return arr;
}

/**
*This function adds the values of the given array.
*@param Requires an integer array
*@return The sum of the all values inside the array.
*/
public static BigInteger R_array_sum(int[] array) {
  BigInteger sum = new BigInteger("0");
  return array_sum_aux(array, 0, sum);
}

private static BigInteger array_sum_aux(int[] array, int i, BigInteger sum) {
  if (i >= array.length) return sum;
  System.out.println(i);
  sum = sum.add(new BigInteger(Integer.toString(array[i])));
  return array_sum_aux(array, i + 1, sum);
}

    public static int array_sum(int[] arr) {
	int sum = 0;
	for (int i = 0; i < arr.length; ++i) {
	    sum += arr[i];
	    }
	return sum;
    }

/**
*This function evaluates the maximum value in the array.
*@param Requires an integer array
*@return the maximum value of the given array.
*/
public static int array_max(int[] array) {
  return array_max_aux(array, 0, 0);
}

private static int array_max_aux(int[] array, int i, int max) {
  if (i >= array.length) return max;
  if (array[i] > max) max = array[i];
  return array_max_aux(array, i + 1, max);
}

/**
*This function represents succession of Fibonacci.
*@param Requiers an integer value.
*@return the (n)th fibonacci integer.
*/
public static int fibonacci(int n) {
  if (n <= 1) return n;
  return fibonacci(n-2) + fibonacci(n-1);
}

  public static void main (String args []) {
    //int[] arr = array_generator(100000000);
    //System.out.println(array_sum(arr));
  }
}
