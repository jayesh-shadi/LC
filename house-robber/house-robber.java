class Solution {
    public int rob(int[] nums) {
        int now=0;
        int last=0;
        for(int num:nums)
        {
            int temp=now;
            now=Math.max(last+num,now);
            last=temp;
        }
        return now;
    }
}