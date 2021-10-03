class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> count=new HashSet<Integer>();
        for(int num:nums)
        {
            if(count.contains(num)) return num;
            else count.add(num);
        }
        return -1;
    }
}