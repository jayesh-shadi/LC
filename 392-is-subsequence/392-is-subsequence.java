class Solution {
    public boolean isSubsequence(String s, String t) {
          int i=0;int j=0;
        boolean flag=false;
        int count=0;
        if(s.length()==0){
            return true;
        }
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                count++;
                if(count==s.length()){
                    flag=true;
                }
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(flag==true){
            return true;
        }
        else{
            return false;
        }
    }
}