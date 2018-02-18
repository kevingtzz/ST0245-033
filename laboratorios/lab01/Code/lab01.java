import java.util.Random;
import java.math.BigInteger;

/**lab01 class declaration.
*@author: Kevin Gutierrez Gomez
*@version: 18/02/18
*/

public class lab01 {

public static int[] array_generator(int n) {
    int[] arr = new int[n];
    Random ran = new Random();
    for (int i = 0; i < n; ++i) {
        arr[i] = ran.nextInt(10);
    }
    return arr;
}

public static BigInteger array_sum(int[] array) {
  BigInteger sum = new BigInteger("0");
  return array_sum_aux(array, 0, sum);
}

private static BigInteger array_sum_aux(int[] array, int i, BigInteger sum) {
  if (i >= array.length) return sum;
  sum.add(new BigInteger(Integer.toString(array[i])));
  return array_sum_aux(array, i + 1, sum);
}


  public static void main (String args []) {
    int[] arr = array_generator(100000000);
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + ", ");
    }

    System.out.println(array_sum(arr));
  }
}
