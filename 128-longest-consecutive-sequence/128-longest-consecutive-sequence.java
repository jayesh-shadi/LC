class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int seq=0;
        for(int i=0;i<nums.length;i++)
        {
            int currnum=nums[i];
            int currseqlength=1;
            if(!set.contains(currnum-1))
            {
                while(set.contains(currnum+1))
                {
                    currnum+=1;
                    currseqlength+=1;
                    
                }
                seq=Math.max(seq,currseqlength);
            }
        }
        return seq;
    }
}