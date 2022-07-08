class Solution {
   public int[] productExceptSelf(int[] nums) {
	int n = nums.length;
	int[] product = new int[n];
	// first calcuate the right product
	product[n-1] = 1;
	for (int i=n-1; i>0; i--)
		product[i-1] = product[i] * nums[i];
	// calcuate the left product as we iterate over the array
	// multipy it with right product calculated above
	// store it in the same array
	int left = 1;
	for (int i=0; i<n; i++) {
		product[i] = left * product[i];
		left = left * nums[i];
	}
	return product;
}
    }
