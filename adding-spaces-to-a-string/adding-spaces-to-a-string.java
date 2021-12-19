class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
       int add=0;
        for(int i:spaces)
        {
            sb.insert(i+add++," ");
        }
        return sb.toString();
    }
}