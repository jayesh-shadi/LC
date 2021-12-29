class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int n:nums1) set.add(n);
        for(int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j]))
            {
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] opt=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            opt[i]=res.get(i);
        }
        return opt;
    }
}