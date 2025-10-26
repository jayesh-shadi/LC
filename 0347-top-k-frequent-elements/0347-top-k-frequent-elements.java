class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //use a hashmap and a priority queue
        if (k == nums.length)
            return nums;
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        //  Build a max-heap sorted by frequency (descending)
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        //add all elements into the heap
        pq.addAll(count.keySet());

        int[] ans = new int[k];
        //Extract top k elements
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;

    }
}