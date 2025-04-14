class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Initialize nums length
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int result[] = new int[n];

        //fill left product
        leftProduct[0]=1;
        for(int i=1;i<n;i++)
        {
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
        //fill right product
        rightProduct[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            rightProduct[i]=rightProduct[i+1]*nums[i+1];
        } 
        for(int i=0;i<n;i++)
        {
            result[i] = leftProduct[i]*rightProduct[i];
        }
        return result;
    }
}