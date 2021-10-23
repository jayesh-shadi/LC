class Solution {
    public int majorityElement(int[] nums) {
    int count=0,ret=0;
        for(int n:nums)
        {
            if(count==0)
            {
                ret=n;
            }
            if(n!=ret)
            {
                count--;
            }
            else{
                count++;
            }
   
        }
             return ret;
    }
}