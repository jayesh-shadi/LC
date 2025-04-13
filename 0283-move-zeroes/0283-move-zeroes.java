class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0) return;
        int insertpos=0;
        for(int num:nums)
        {
            if(num!=0) nums[insertpos++] =num;
        }
        while(insertpos<nums.length)
        {
            nums[insertpos++ ]=0;
        }
    }
}