class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum=0;
           for(int i:beans) sum+=i;
        long res=Long.MAX_VALUE;
          int n=beans.length;
         for(int i=0;i<n;i++){
            res=Math.min(res, (sum-((long)beans[i]*(n-i))));
        }
        return res;               
    }
}