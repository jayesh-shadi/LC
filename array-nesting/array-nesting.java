class Solution {
    public int arrayNesting(int[] nums) {
        int result=0,n=nums.length;
        boolean[] seen=new boolean[n];
        for(int i: nums)
        {
            int count=0;
            while(!seen[i])
            {
                seen[i]=true;
                count++;
                i=nums[i];
            }
            result=Math.max(result,count);
        }
        return result;
       }
}