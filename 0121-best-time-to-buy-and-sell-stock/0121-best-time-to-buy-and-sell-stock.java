class Solution {
    public int maxProfit(int[] prices) {
        //7 1 4 3 6 4
        //Iteration1 
        //min =7, 7<7 false max(0,0) profit=0
        //min= 1<7 true min=1 profit (1-1) = 0
        //min = 4<1 false min =1 profit (4-1) = 3
        //min = 3<1 false min=1 profit (3-1)=2
        //min = 6<1 false min=1 profit(6-1)=5
        //min- 4<1 false min=1 profit(4-1)=3
        int min= prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}