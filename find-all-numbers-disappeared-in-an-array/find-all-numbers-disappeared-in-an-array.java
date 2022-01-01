class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int res[] = new int[nums.length+1];
        for(int n:nums)
        {
            res[n]=n;
        }
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<res.length;i++)
        {
            if(res[i]==0)
            {
                result.add(i);
            }
        }
        return result;
    }
}