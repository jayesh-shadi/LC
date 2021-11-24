class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int index=nums[nums.length-k];
        return index;
    }
}