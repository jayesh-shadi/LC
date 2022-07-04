class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         //time complexity (n^2) space complexity(o(1))
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//             int comp=target-nums[i];
//                 if(nums[j]==comp)
//                 {
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         throw new IllegalArgumentException("No element found");
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No match found");
    }
}