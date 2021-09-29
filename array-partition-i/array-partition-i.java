class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i+=2)
        {
            max=max+nums[i];
      
    }
          return max;
}
}
