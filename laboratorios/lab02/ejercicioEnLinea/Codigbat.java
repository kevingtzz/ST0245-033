plublic class Codingbat {

  public int[] zeroFront(int[] nums) {
      int[] res      = new int[nums.length];
      int zeroPos    = 0;
      int nonZeroPos = res.length - 1;

      for (int i = 0; i < nums.length; i++)
          if (nums[i] == 0)
              res[zeroPos++]    = 0;
          else
              res[nonZeroPos--] = nums[i];

      return res;
  }

  public int[] withoutTen(int[] nums) {
    int[] copy = new int[nums.length];
    int index = 0;

    for (int i = 0; i < nums.length; i++)
        if (nums[i] != 10) {
            copy[index] = nums[i];
            index++;
        }
    return copy;
}

public int[] zeroMax(int[] nums) {
    int lOdd = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] % 2 == 1 && nums[i] > lOdd)
            lOdd = nums[i];
        if (nums[i] == 0)
            nums[i] = lOdd;
    }
    return nums;
}

public int[] evenOdd(int[] nums) {
    int[] narr   = new int[nums.length];
    int evenPos = 0;
    int oddPos  = narr.length - 1;

    for (int i = 0; i < nums.length; i++)
        if (nums[i] % 2 == 0)
            narr[evenPos++] = nums[i];
        else
            narr[oddPos--]  = nums[i];
    return narr;
}

public String[] fizzBuzz(int start, int end) {
    String[] FB = new String[Math.abs(start-end)];
    int index = 0;

    for (int i = start; i < end; i++) {

        if (i % 3 == 0 && i % 5 == 0) FB[index] = "FizzBuzz";
        else if (i % 3 == 0) FB[index] = "Fizz";
        else if (i % 5 == 0) FB[index] = "Buzz";
        else FB[index] = String.valueOf(i);
        index++;
    }
    return FB;
}

public int maxSpan(int[] nums) {
	int maxspan=1;
		int span=0;

	    if (nums.length>0) {
	    	for (int  i= 0; i < nums.length; i++) {
				for (int j = nums.length-1; j >= i; j--) {

					if(nums[j] == nums[i]){
						span = j - i+1;
						if(span > maxspan){
							maxspan = span;
						}

					}
				}
			}
	 }

		 else {
			maxspan=0;

		}
		return maxspan;
}

public int[] fix34(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 3) {
            int temp = nums[i + 1];
            nums[i + 1] = 4;
            for (int j = i + 2; j < nums.length; j++)
                if (nums[j] == 4) nums[j] = temp;
        }
    return nums;
}

public int[] fix45(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
            int p5 = i;
            for (int j = 0; j < nums.length; j++)
                if (nums[j] == 4 && nums[j + 1] != 5) {
                    int temp = nums[j + 1];
                    nums[j + 1] = 5;
                    nums[p5] = temp;
                    break;
                }
    }
    return nums;
}

public boolean canBalance(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        int sum = 0;
        for (int j = 0; j < i; j++) sum += nums[j];
        for (int j = i; j < nums.length; j++) sum -= nums[j];
        if (sum == 0) return true;
    }
    return false;
}

public int countClumps(int[] nums) {
 boolean m = false;
  int c = 0;
  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] == nums[i+1] && !m) {
      m = true;
      c++;
    }
    else if (nums[i] != nums[i+1]) {
      m = false;
    }
  }
  return c;
}

}
