class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double[] ans=new double[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++)
        {
            ans[nums1.length+j]=nums2[j];
        }
        Arrays.sort(ans);
        int start=0;
        int end=ans.length-1;
        int mid=start+(end-start)/2;
        
        if(ans.length%2==1)
        {
            return ans[mid];
        }
        else{
            double median=(ans[mid]+ans[mid+1])/2;
            return median;
        }
    }
}