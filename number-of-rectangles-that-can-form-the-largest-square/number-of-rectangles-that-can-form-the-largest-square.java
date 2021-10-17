class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0,ans=0;
        for(int[] rectangle:rectangles)
        {
            int min=Math.min(rectangle[0],rectangle[1]);
            map.put(min,map.getOrDefault(min,0)+1);
                ans=(min>=max)?map.get(min):ans;
            max=Math.max(max,min);
        }
        return ans;
    }
}