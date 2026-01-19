class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int k=0;
        int j=s.length()-1;

        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(k)!=s.charAt(j))
            {
                return false;
            }
            k++;
            j--;
        }
        return true;
    }
}