class Solution {
    public int majorityElement(int[] nums) {
        int result=nums[0];
        int count=1;
        for(int n:nums)
        {
            if(n==result) ++count;
            else{
                --count;
            }
                if(count==0)
                {
                  result=n;
                count+=1;
                }
        }
      return result;  
    }
}