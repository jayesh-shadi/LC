class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;        // number of rows
        int n = grid[0].length;     // number of columns
        int count = 0;              // total count of negative numbers

        // Traverse each row
        for (int i = 0; i < m; i++) {

            int left = 0, right = n - 1;

            // Binary search to find the first negative number in the row
            while (left <= right) {
                int mid = left + (right - left) / 2;

                // If negative, move left to find the first occurrence
                if (grid[i][mid] < 0) {
                    right = mid - 1;
                } 
                // If non-negative, discard left half
                else {
                    left = mid + 1;
                }
            }

            // All elements from 'left' to end are negative
            count += (n - left);
        }

        return count;
    }
}
