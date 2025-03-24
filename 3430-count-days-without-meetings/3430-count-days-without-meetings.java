class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0], b[0]));
         int busyDays = 0, prevEnd = 0;
          for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            if (start > prevEnd + 1) {
                busyDays += end - start + 1;
            } else {
                busyDays += Math.max(0, end - prevEnd);
            }
            prevEnd = Math.max(prevEnd, end);
        }
        return days-busyDays;

    }
} 

// int days = 10;
// int[][] meetings = {{5,7}, {1,3}, {9,10}};
// Step 1: Sort Meetings
// Sorted meetings = [[1,3], [5,7], [9,10]]

// Step 2: Initialize
// java
// Copy
// Edit
// busyDays = 0, prevEnd = 0;
// Step 3: Process Meetings
// [1,3] → Add 3 days → busyDays = 3, prevEnd = 3

// [5,7] → Add 3 days → busyDays = 6, prevEnd = 7

// [9,10] → Add 2 days → busyDays = 8, prevEnd = 10

// Step 4: Compute Free Days
// java
// Copy
// Edit
// return days - busyDays;  // 10 - 8 = 2
// ✅ Output: 2 (Free days: {4,8}) 

// class Solution {
//     public int countDays(int days, int[][] meetings) {
//         boolean[] busy = new boolean[days + 1]; // Mark busy days
//         // Mark days that have meetings
//         for (int[] meeting : meetings) {
//             for (int i = meeting[0]; i <= meeting[1]; i++) {
//                 busy[i] = true;
//             }
//         }
//         // Count free days
//         int freeDays = 0;
//         for (int i = 1; i <= days; i++) {
//             if (!busy[i])
//                 freeDays++;
//         }

//         return freeDays;

//     }
// }