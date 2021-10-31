class Solution {
    public int[] diStringMatch(String s) {
        int size=s.length();
        int low=0;
        int high=size;
        int[] op=new int[size+1];
        for(int i=0;i<size;i++)
        {
            if(s.charAt(i)=='I')
                op[i]=low++;
            else{
                op[i]=high--;
            }
        }
        op[size]=high;
        return op;
    }
}