class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
      int len=nums.length;
           return Math.max(nums[len-3]*nums[len-1]*nums[len-2],nums[0]*nums[1]*nums[len-1]);

    }
}