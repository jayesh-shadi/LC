class Solution {
    public String truncateSentence(String s, int k) {
        String[] spt=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            s1.append(spt[i]);
            if(i<k-1)
            {
                s1.append(" ");
            }
        }
        return s1.toString();
    }
}