class Solution {
    public int minOperations(int[][] grid, int x) {
        //flatten the list from 2d array to 1d array
        List<Integer> list = new ArrayList<>();
        for(int[] row:grid)
        {
            for(int num:row)
            {
                list.add(num);
            }
        }
        //check for remainder of each element if it isnt same the uni-value is impossible
        int remainder = list.get(0)%x;
        for(int num:list)
        {
            if(num%x!=remainder)
            {
                return -1;
            }
        }

        //calculate the minimum operations
        Collections.sort(list);
        int target = list.get(list.size()/2);
        int operations=0;

        for(int num:list)
        {
            operations+=Math.abs(num-target)/x;
        }
        return operations;
    }
}