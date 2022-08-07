class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            if(map.containsKey(nums[i]) && i-map.get(current)<=k)
            {
                return true;
            }
            else{
                map.put(current,i);
            }
        }
        return false;
    }
}