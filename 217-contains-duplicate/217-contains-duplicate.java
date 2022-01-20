class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hash.add(nums[i])) return true;
        }
        return false;
    }
}