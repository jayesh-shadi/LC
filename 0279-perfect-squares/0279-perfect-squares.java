class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            if(isPerfectSquare(i))
            {
                dp[i]=1;
                continue;
            }
        
            for(int j=1;j*j<=i;j++)
            {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];

    }
    
    private boolean isPerfectSquare(int n)
    {
        int root= (int) Math.sqrt(n);
        return root*root==n;
    }
}