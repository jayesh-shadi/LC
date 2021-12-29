class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
        int[] leftprod=new int[N];
        int[] rightprod=new int[N];
        int[] output=new int[N];
        
        leftprod[0]=1;
        rightprod[N-1]=1;
        for(int i=1;i<N;i++)
        {
            leftprod[i]=nums[i-1]*leftprod[i-1];
        }
        for(int i=N-2;i>=0;i--)
        {
            rightprod[i]=nums[i+1]*rightprod[i+1];
        }
        for(int i=0;i<N;i++)
        {
            output[i]=leftprod[i]*rightprod[i];
        }
        return output;
    }
}