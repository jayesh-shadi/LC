class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE, a=0;
        {
        for(int x:nums)
        {
            a+=x;
            ans=Math.max(ans,a);
            a=Math.max(a,0);
        }
            return ans;
        }
    }
}

// public int maxSubArray(int[] nums) {
//   int n = nums.length;
//   int SUM = nums[0];
//   int OPT = nums[0];
//   for (int i = 1; i < n; ++i) {
//     SUM = Math.max(SUM + nums[i], nums[i]);
//     OPT = Math.max(OPT, SUM);
//   }
//   return OPT;
// }