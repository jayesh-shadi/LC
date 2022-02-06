class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>  q=new PriorityQueue<>();
        for(int num:nums)
        {
            q.offer(num);
            
        }while(k<q.size())
            {
                q.poll();
            }
        return q.peek();
     }
}