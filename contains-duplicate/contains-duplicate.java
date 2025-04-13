//O(n^2) solution

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=1;j<n;j++)
//                 {
//                     if(nums[i]==nums[j])
//                     {
//                         return true;
//                     }
//                 }
//         }
//         return false;
//     }
// }

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
// A HashSet is a part of Java’s Collection Framework and is used to store a collection of unique elements. It is backed by a hash table, which makes operations like add, remove, and contains very fast — typically O(1) time.

// Feature	Description
// No Duplicates	Automatically avoids duplicate values.
// Unordered	Elements are not stored in insertion order.
// Fast Lookups	contains() is very efficient (constant time on average).
// Null Allowed	Can store one null element.
