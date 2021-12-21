class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
         HashSet <Integer> set = new HashSet(); 
        for(int a:arr)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        for(int element:map.values())
        {
            set.add(element);
        }
         if(set.size() == map.size()) // Iterating over this set requires time proportional to the sum of the HashSet instance's size (the number of elements), 
		                            //so if the size of the HashSet equals to the size of HashMap, and knowing that HashMap keeps only uniqe keys, we can deduce that all of the occrrences are uniqe.
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}