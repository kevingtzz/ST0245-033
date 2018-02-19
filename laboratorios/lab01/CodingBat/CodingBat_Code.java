public class CodingBat_Code {

//----------------------------Recursion 1-------------------------------------//

  public int factorial(int n) {
  return (n != 0)?n * factorial(n-1):1;
}

public int bunnyEars(int bunnies) {
 return (bunnies == 0) ?bunnies :2 + bunnyEars(bunnies - 1);
}

public int fibonacci(int n) {
  return (n <= 1) ? n : fibonacci(n - 2) + fibonacci(n -1);
}

public int bunnyEars2(int bunnies) {
  if (bunnies <= 0) return 0;
  return (bunnies % 2 == 0)
    ?3 + bunnyEars2(bunnies - 1)
    :2 + bunnyEars2(bunnies - 1);
}

public int triangle(int rows) {
  return (rows != 0) ?rows + triangle(rows - 1) :0;
}

public int sumDigits(int n) {
  return (n == 0) ?0 :(n % 10) + sumDigits(n/10);
}

public int count7(int n) {
  if (n == 0) return 0;
  return (n % 10 == 7) ? 1 + count7(n / 10) :count7(n / 10);
}

public int count8(int n) {
    if (n == 0) return 0;
    if (n >= 88 && n % 100 == 88) return 2 + count8(n / 10);
    if (n % 10 == 8) return 1 + count8(n / 10);
    return count8(n / 10);
}

public int powerN(int base, int n) {
  return (n != 0) ?base * powerN(base, n - 1) :1;
}

public int countX(String str) {
  if (str.length() == 0) return 0;
  return (str.charAt(0) == 'x') ?1 + countX(str.substring(1)) : countX(str.substring(1));
}

public int countHi(String str) {
  if (str.length() <= 1) return 0;
  return (str.substring(0,2).equals("hi"))? 1 + countHi(str.substring(1))
  :countHi(str.substring(1));

}

public String changeXY(String str) {
  if (str.length() == 0) return str;
  return (str.substring(0,1).equals("x"))
    ? "y" + changeXY(str.substring(1))
    :str.charAt(0) + changeXY(str.substring(1));
}

public String changePi(String str) {
  if (str.length() <= 1) return str;
  return (str.substring(0,2).equals("pi"))
    ? "3.14" + changePi(str.substring(2))
    :str.charAt(0) + changePi(str.substring(1));
}

public String noX(String str) {
  if (str.length() == 0) return str;
  return (str.charAt(0) == 'x')
    ? noX(str.substring(1))
    : str.charAt(0) + noX(str.substring(1));
}

public boolean array6(int[] nums, int index) {
  if (index == nums.length) return false;
  return (nums[index] == 6) ?true :array6(nums, index + 1);
}

public int array11(int[] nums, int index) {
  if (index == nums.length) return 0;
  return (nums[index] == 11) ?1 + array11(nums, index + 1) :array11(nums, index + 1);
}

public boolean array220(int[] nums, int index) {
  if (index == nums.length - 1 || nums.length == 0) return false;
  return (nums[index + 1] == (nums[index] * 10)) ?true :array220(nums, index + 1);
}

public String allStar(String str) {
  return (str.length() > 1) ?str.charAt(0) + "*" + allStar(str.substring(1)) :str;
}

public String pairStar(String str) {
  if (str.length() <= 1) return str;
  return (str.charAt(0) == str.charAt(1))
    ?str.charAt(0) + "*" + pairStar(str.substring(1))
    :str.charAt(0) + pairStar(str.substring(1));
}


//--------------------------Recursion 2---------------------------------------//

public boolean groupSum(int start, int[] nums, int target) {
    return (start == nums.length) ? target == 0
     : groupSum(start + 1, nums, target)
      || groupSum(start + 1, nums, target - nums[start]);
}

public boolean groupSum6(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  if (nums[start] == 6) return groupSum6(start +1, nums, target - nums[start]);
  return groupSum6(start + 1, nums, target)
    || groupSum6(start + 1, nums, target - nums[start]);
}

public boolean groupNoAdj(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  return groupNoAdj(start + 2, nums, target - nums[start])
    || groupNoAdj(start + 1, nums, target);
}

public boolean groupSum5(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  if (nums[start] % 5 == 0)
    if (start < nums.length - 1 && nums[start + 1] == 1)
    return groupSum5(start + 2, nums, target - nums[start]);
      else return groupSum5(start + 1, nums, target - nums[start]);
  return groupSum5(start + 1, nums, target)
    || groupSum5(start + 1, nums, target - nums[start]);
}

public boolean groupSumClump(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  int sum = nums[start];
  int count = 1;
  for (int i = start + 1; i < nums.length; i++)
    if (nums[i] == nums[start]) {
      sum += nums[i];
      count++;
  }
  return groupSumClump(start + count, nums, target - sum)
      || groupSumClump(start + count, nums, target);
}

public boolean splitArray(int[] nums) {
 return splitArray_aux(0, nums, 0, 0);
}

private boolean splitArray_aux(int start, int[] nums, int sum1, int sum2) {
   if (start >= nums.length) return sum1 == sum2;
   return splitArray_aux(start + 1, nums, sum1 + nums[start], sum2)
       || splitArray_aux(start + 1, nums, sum1, sum2 + nums[start]);
}



public static void main (String args[]) {

  }
}
