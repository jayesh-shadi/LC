class Solution {
    public int minAddToMakeValid(String s) {
        int balance=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            balance+=s.charAt(i)=='('?1:-1;
            if(balance==-1)
            {
                ans+=1;
                balance=balance+1;
                
            }
        }
        return ans+balance;
    }
}