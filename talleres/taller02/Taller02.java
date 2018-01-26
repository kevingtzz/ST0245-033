class Taller02 {
    public static void main (String args []) {
	Taller02 test = new Taller02();
	int[] array = {2,4,8};
	combinations("", "abc");
	
	System.out.println(test.mcuEuclides(128, 64));

	if(test.groupSum(0, array, 10)) System.out.println("True");
	   else System.out.println("False");
    }

    public int mcuEuclides(int p, int q) {
	if (p % q == 0) return q;
	return mcuEuclides(p, p % q);
    }

    public boolean groupSum(int start, int[] nums, int target) {
	if (start == nums.length) return target == 0;
	return groupSum(start + 1, nums, target) 
	    || groupSum(start + 1, nums, target - nums[start]);
    }

    public static void combinations(String base, String s) {
    if (s.length() == 0) {
      System.out.println(base);
    }else{ combinations(base + s.charAt(0), s.substring(1));
	combinations(base, s.substring(1));
         } 
    }

}
