class Solution {
    public int arraySign(int[] nums) {
        int num=1;
        for(int n:nums)
        {
            if(n==0)
            {
                num=0;
            }
            else if(n<0)
            {
                num=-num;
            }
            
        }
        return num;
    }
}