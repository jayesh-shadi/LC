class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s==null || s.length()==0) return null;
        List<Integer> output=new ArrayList<>();
        int[] lastindices=new int[26];
        for(int i=0;i<s.length();i++)
        {
            lastindices[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            end=Math.max(end,lastindices[s.charAt(i)-'a']);
            {
                if(end==i)
                {
                    output.add(end-start+1);
                    start=end+1;
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        return output;
    }
}