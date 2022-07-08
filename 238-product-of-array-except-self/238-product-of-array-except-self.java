class Solution {
   public int[] productExceptSelf(int[] nums) {
//        explaination with example:
// nums = [1, 2, 3, 4]
// for the first pass the product array will store right product
// product = [0, 0, 0, 0]
// since rightmost element won't have any right element so lets assume right product for it to be 1
// so our product array becomes
// product = [0, 0, 0, 1]
// so after first pass our product array will become
// product = [24, 12, 4, 1]

// now for the second pass
// lets now take a variable left which will store the left product as we iterate over the nums array from left to right;
// since leftmost element won't have any left element initialize left = 1

// simultaneously, as we iterate over nums array modify product array as
// 'product[i] = left * product[i];` which is basically, left array product * right array product.

// nums = [1, 2, 3, 4]
// i=0; left = 1; product = [24, 12, 4, 1]
// i=1; left = 1; product = [24, 12, 4, 1]
// i=2; left = 2; product = [24, 12, 8, 1]
// i=3; left = 6; product = [24, 12, 8, 6]
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
