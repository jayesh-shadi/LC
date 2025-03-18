class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // In case k is greater than the length of the array
        reverse(nums, 0, n - 1);  // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1);  // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1);  // Step 3: Reverse the rest of the elements

    }

    public void reverse(int[] nums,int start,int end)
    {
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}

// For nums = [1, 2, 3, 4, 5, 6, 7] and k = 3:

// Initial Array: [1, 2, 3, 4, 5, 6, 7]
// Reverse the entire array: [7, 6, 5, 4, 3, 2, 1]
// Reverse the first k=3 elements: [5, 6, 7, 4, 3, 2, 1]
// Reverse the remaining n-k=4 elements: [5, 6, 7, 1, 2, 3, 4]
// Final result: [5, 6, 7, 1, 2, 3, 4]