class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Place each number in its correct index position if possible
        // Example: value 3 should go to index 2 (3 - 1)
        for (int i = 0; i < n; i++) {
            // Keep swapping until the current number is in the correct position
            // Only swap if:
            // 1) nums[i] is a positive number
            // 2) nums[i] is within the range 1..n
            // 3) nums[i] is not already in its correct position (prevents infinite loop on duplicates)
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        // After rearranging, the first index i where nums[i] != i + 1
        // means i+1 is the missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all numbers from 1..n are in correct position
        // then the missing positive is n+1
        return n + 1;
    }

    // Utility function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
