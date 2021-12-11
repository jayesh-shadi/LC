class Solution {
    public int[] searchRange(int[] arr, int d) {
      int low=0;
    int high=arr.length-1;
    int fi=-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(d<arr[mid])
        {
            high=mid-1;
        }
        else if(d>arr[mid])
        {
            low=mid+1;
        }
        else{
            fi=mid;
            high=mid-1;
        }
    }
    
    low=0;
     high=arr.length-1;
    int li=-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(d<arr[mid])
        {
            high=mid-1;
        }
        else if(d>arr[mid])
        {
            low=mid+1;
        }
        else{
            li=mid;
            low=mid+1;
        }
    }
        return new int[]{fi,li};
    }
    
}