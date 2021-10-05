class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int data=x;
           int r=0;
        while(x!=0)
        {
         
            int sum=0;
            sum=x%10;
            x=x/10;
            r=r*10+sum;
        }
        if(data==r)
        {
            return true;
        }
        else{
           return false;
        }
    }
}