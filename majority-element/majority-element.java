class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        HashMap<Integer,Integer>  hash=new HashMap<>();
        for(int i:nums)
        {
            if(!hash.containsKey(i))
                hash.put(i,1);
            else
                hash.put(i,hash.get(i)+1);                
            if(hash.get(i)>nums.length/2)
            {
                res=i;
                break;
            }
        }
        return res;
    }
}