class Solution {
    public int reverse(int x) {
          if(x<10 && x>-10) {
            return x;
        }
        long rev =0;
        while(x!=0)
        {
            rev=rev*10 + x%10;
            x=x/10;
          
        }
      return rev>=Integer.MIN_VALUE && rev<= Integer.MAX_VALUE ? (int)rev : 0 ;
    }
}