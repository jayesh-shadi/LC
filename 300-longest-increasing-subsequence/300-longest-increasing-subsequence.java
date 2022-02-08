class Solution {
    public int lengthOfLIS(int[] nums) {
           if(nums==null || nums.length==0){
        return 0;
    }
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
           
        }
         int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                max=Math.max(max,dp[i]);
            }
        return max;
    }
}