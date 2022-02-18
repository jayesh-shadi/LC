class Solution {
    public List<String> stringMatching(String[] words) {
        String s=String.join(" ",words);
        ArrayList<String> res=new ArrayList<>();
        for(String word:words)
        {
            if(s.indexOf(word)!=s.lastIndexOf(word)) res.add(word);
        }
        return res;
    }
}