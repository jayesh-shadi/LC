class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        if(len==0) return 0;
        int index=0;
        while(index<len && s.charAt(index)==' ') {++index;}
        boolean isnegative=false;
        if(index<s.length())
        {if(s.charAt(index)=='-')
        {
            isnegative=true;
            ++index;
        }
        else if(s.charAt(index)=='+')
        {
            ++index;
        }   
        }
        int result=0;
        while(index<len && isDigit(s.charAt(index)))
        {
            int digit=s.charAt(index)-'0';
              if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
          return isnegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
             result=result*10+digit;
            ++index;
        }
           return isnegative ? -result : result;
        
    }
     private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }
}