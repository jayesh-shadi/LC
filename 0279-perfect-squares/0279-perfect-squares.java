class Solution {

    public int numSquares(int n) {

        // dp[i] = minimum number of perfect squares needed to make sum i
        //space for dp array used
        int[] dp = new int[n + 1];

        // Initialize dp array with a large value (worst case)
        // We don't know answers yet
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Base case:
        // To make sum 0, we need 0 perfect squares
        dp[0] = 0;

        // Build the dp array from 1 to n
        //runs for n
        for (int i = 1; i <= n; i++) {

            // If i itself is a perfect square,
            // then answer is 1 (e.g., 1, 4, 9, 16...)
            if (isPerfectSquare(i)) {
                dp[i] = 1;
                continue; // no need to check further
            }

            // Try all perfect squares less than or equal to i
            //runs for root i
            for (int j = 1; j * j <= i; j++) {

                // Use square j*j and check remaining part (i - j*j)
                // +1 because we are using one square now
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        // Final answer will be stored in dp[n]
        return dp[n];
    }

    // Helper function to check if a number is a perfect square
    private boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}
// Time Complexity: O(n√n)
// Space Complexity: O(n)