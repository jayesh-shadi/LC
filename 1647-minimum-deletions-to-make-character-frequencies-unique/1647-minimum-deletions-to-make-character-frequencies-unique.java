class Solution {
    public int minDeletions(String s) {
        //TC : O(n)
        //SC : O(n)
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        { 
          map.put(ch,map.getOrDefault(ch,0)+1);  
        }
        HashSet<Integer> counts = new HashSet<>();
          int toDelete = 0;
           for(char ch : map.keySet()) {
            int cnt = map.get(ch);
            while(counts.contains(cnt)) {
                toDelete++;
                cnt--;
            } if(cnt > 0) counts.add(cnt);
        }
        return toDelete;
            
    }
}