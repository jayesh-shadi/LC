class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int expectedSum= n*(n+1)/2;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
         return expectedSum-sum;
    }
   
}

// O(n): We iterate through the array to calculate the actual sum, which takes linear time.

// O(1): We use only a few extra variables (like expectedSum and actualSum), so the space complexity is constant.


