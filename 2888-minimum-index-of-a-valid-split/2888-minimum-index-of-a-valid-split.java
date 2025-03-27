class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // put all elements in hashmap
        // with its count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // find the dominant element
        int dominantElement = -1;
        int treshold = nums.size() / 2;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > treshold) {
                dominantElement = entry.getKey();
                break;
            }
        }

        // find the minimum index of a valid split
        int leftCount = 0;
        int totalCount = map.get(dominantElement);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == dominantElement) {
                leftCount++;
            }
            int rightCount = totalCount - leftCount;
            if (leftCount * 2 > (i + 1) && rightCount * 2 > (nums.size() - i - 1)) {
                return i;
            }
        }
        return -1;
    }
}