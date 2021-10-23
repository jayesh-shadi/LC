class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrsize=0;
        for(int i=0;i<nums.length;i+=2)
        {
            arrsize=arrsize+nums[i];
        }
               int[] result = new int[arrsize];
         int startIdx = 0;
            for(int i=0;i<nums.length;i+=2)
            {
                Arrays.fill(result,startIdx,startIdx+nums[i],nums[i+1]);
                startIdx += nums[i];
            }
    return result;
    }
}