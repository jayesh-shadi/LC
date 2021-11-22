class Solution {
    public int maxDepth(String s) {
        int res=0,current=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                res=Math.max(res,++current);
            if(s.charAt(i)==')')
                current--;
        }
        return res;
    }
}