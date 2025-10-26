class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prefix=1;
        int postfix=1;
        //fill 1 into result arr
        Arrays.fill(ans,1);
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            ans[j] = ans[j]*postfix;
            postfix=postfix*nums[j];
        }
        return ans;
    }
}