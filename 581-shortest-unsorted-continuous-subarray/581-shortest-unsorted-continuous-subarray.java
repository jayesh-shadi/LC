class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] newarr=nums.clone();
        int start=0,end=0;
        Arrays.sort(newarr);
        int i=0,j=nums.length-1;
        while(i<nums.length)
        {
            if(nums[i]!=newarr[i])
            {
                start=i;
            break;}
            i++;
        }
        while(j>=0)
        {
            if(nums[j]!=newarr[j])
            {
                end=j;
                break;
                
            }
            j--;
        }
        return start==0 && end==0?0 :(end-start)+1;
    }
}