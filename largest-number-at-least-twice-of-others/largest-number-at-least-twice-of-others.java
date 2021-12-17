class Solution {
    public int dominantIndex(int[] nums) {
    int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            max=Math.max(i,max);
        }
        int pos=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==max) pos=j;
            int twice=nums[j]*2;
            if(twice>max && nums[j]!=max) return -1;
        }
        return pos;
    }
}