class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNos=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
        {
            missingNos.add(i);
        }
        }
        
        return missingNos;
    }
}