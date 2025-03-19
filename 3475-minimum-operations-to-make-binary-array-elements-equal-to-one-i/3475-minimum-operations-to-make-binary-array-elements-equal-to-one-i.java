class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;
            }
        }

        return (nums[n - 2] == 1 && nums[n - 1] == 1) ? count : -1;
    }
}

// Iterate through the array from index 0 to n-3 (inclusive).
// Whenever we encounter a 0, flip that element and the next two elements (using XOR operation).
// Count each flip operation.
// After processing, check if the last two elements are both 1:
// If yes, return the count of operations.
// If not, return -1 (it's impossible to make all elements 1).
// This works because any valid solution must leave the last two elements as 1s. If they're not both 1 after our greedy process, no solution exists.