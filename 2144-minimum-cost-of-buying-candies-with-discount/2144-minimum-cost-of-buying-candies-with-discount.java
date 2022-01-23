class Solution {
    public int minimumCost(int[] cost) {
        int count=0;
        Arrays.sort(cost);
        for(int i=0;i<cost.length;i++)
            if((i%3)!=(cost.length%3))
            count+=cost[i];
        return count;
    }
}