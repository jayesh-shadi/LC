class Solution {
    public int lengthOfLongestSubstring(String s) {
      int count1=0,count2=0,max=0;
        HashSet<Character> set=new HashSet<>();
        while(count1<s.length())
        {
            if(!set.contains(s.charAt(count1))) 
            {
                set.add(s.charAt(count1)); count1++;
                        max=Math.max(max,set.size());
        }
                        else{
                            set.remove(s.charAt(count2)); count2++;
                        }
    }
                        return max;}
}