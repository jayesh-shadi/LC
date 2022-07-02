class Solution {
     public int thirdMax(int[] nums) {
        //init  treeSet
        //populate set
        //if the set size >= 3 pop off first 2 maxes
        //then return last element
        
        TreeSet<Integer> set = new TreeSet<>();
    
        for(int i : nums)
        {
            set.add(i);
        }
        
        if(set.size() >= 3)
        {
            set.pollLast();
            set.pollLast();
        }
        
        return set.last();
    }
}