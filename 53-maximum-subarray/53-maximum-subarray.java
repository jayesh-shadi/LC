class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int lmax=0;
        int gmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            lmax=Math.max(nums[i],nums[i]+lmax);
                if(lmax>gmax)
                {
                    gmax=lmax;
                }
        }
        return gmax;
    }
}