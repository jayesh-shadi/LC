class Solution {
    public boolean isPalindrome(int x) {
        //String Approach is not optimal as it consumes extra space of string o(n)
        // String s = String.valueOf(x);
        // int k=0;
        // int j=s.length()-1;

        // for(int i=0;i<s.length()-1;i++)
        // {
        //     if(s.charAt(k)!=s.charAt(j))
        //     {
        //         return false;
        //     }
        //     k++;
        //     j--;
        // }
        // return true;

        if(x<0 || (x%10==0 && x>0))
        {
            return false;
        }
          int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For even digits: x == reversed
        // For odd digits: x == reversed / 10
        return x == reversed || x == reversed / 10;

    }
}