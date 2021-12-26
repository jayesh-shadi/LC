class Solution {
    public boolean canJump(int[] nums) {
     int lastposn=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i+nums[i]>=lastposn)
            {
                lastposn=i;
            }
        }
        return lastposn==0;
    }
}