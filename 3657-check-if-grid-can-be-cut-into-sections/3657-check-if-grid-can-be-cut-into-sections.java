import java.util.*;

class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]> xs = new ArrayList<>();
        List<int[]> ys = new ArrayList<>();

        for (int[] rect : rectangles) {
            xs.add(new int[]{rect[0], rect[2]}); // (startX, endX)
            ys.add(new int[]{rect[1], rect[3]}); // (startY, endY)
        }

        return Math.max(countMerged(xs), countMerged(ys)) >= 3;
    }

    private int countMerged(List<int[]> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // Sort by start value
        int count = 0, prevEnd = -1;

        for (int[] interval : intervals) {
            int start = interval[0], end = interval[1];
            if (start < prevEnd) {
                prevEnd = Math.max(prevEnd, end); // Merge overlapping intervals
            } else {
                prevEnd = end;
                count++; // New segment found
            }
        }
        return count;
    }
}
