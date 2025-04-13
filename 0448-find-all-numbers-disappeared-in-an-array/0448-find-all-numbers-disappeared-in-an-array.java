//Below soln takes O(n) time and O(n) space due to the Hashset
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         for (int i = 1; i <= nums.length; i++) {
//             if (!set.contains(i)) {
//                 ans.add(i);
//             }
//         }
//         return ans;
//     }
// }

//Reduces extra space
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];  // Mark as visited
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);  // i+1 is missing
            }
        }

        return result;
    }
}
