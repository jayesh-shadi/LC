class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums==null || nums.length==0)return 0;
        int start=0,end=0,sum=0,minlength=Integer.MAX_VALUE;
        while(end<nums.length) // 1 . 0< 6
            // 1<6 
            //2<6
            //3<6 
            //4<6 
        {
            sum+=nums[end++]; // 0 +2 
             // iteration 2    2 + 3=5
            // iteration 3    5+1=6 
            //iteration 4    6+2 
            
            while(sum>=target) 
            {
                minlength=Math.min(minlength,end-start);
                sum-=nums[start++];
            }
        }
         return minlength == Integer.MAX_VALUE ? 0 : minlength;
        
    }
    
}