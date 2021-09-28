class Solution {
    public boolean isAnagram(String s, String t) {
        char[] alphabet=new char[26];
        for(int i=0;i<s.length();i++) alphabet[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++) alphabet[t.charAt(i)-'a']--;
        for(int i:alphabet) if(i!=0) return false;
         return true;
    }
   
}