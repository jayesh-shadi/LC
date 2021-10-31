class Solution {
    public boolean rotateString(String A, String B) {
        if(A==null && B==null)
        {
            return false;
        }
        if(A.length()!=B.length())
        {
            return false;
        }
        
        for(int i = 0; i < A.length(); i++) {
            if(rotate(A, B, i)) {
                return true;
            }
        }
        return false;
    }
        
        
        private boolean rotate(String A,String B,int rotation)
        {
            for(int i=0;i<A.length();i++)
            {
                if(A.charAt(i)!=B.charAt((rotation+i)%B.length()))
                {
                    return false;
                }
            }
            return true;
        }
    }
