class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] ans = new int[2];
        while(i<j)
        {
            int sum=numbers[i]+numbers[j];
            if(sum==target)
            {
               return new int[]{i+1,j+1};
            }
            else if(sum>target)
            {
                    j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}

// Time Complexity: O(n)	Each element is checked at most once, making it linear time.
// Space Complexity: O(1)	No extra space is used aside from the output array.