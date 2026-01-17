class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //dry run
//         | i | nums[i] | complement | map           |
// | - | ------- | ---------- | ------------- |
// | 0 | 2       | 7          | {2=0}         |
// | 1 | 7       | 2          | FOUND → [0,1] |

        for(int i=0;i<nums.length;i++)
        {
           int complement= target-nums[i];
              if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}