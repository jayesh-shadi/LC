/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int add = 0;
         ListNode sum = new ListNode(0);
         ListNode list = sum;

         while (l1 != null || l2 != null || add != 0) {

             int temp = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);

             add += temp;
             sum.next = new ListNode(add % 10);
             sum = sum.next;

             add /= 10;
             l1 = (l1 == null ? null : l1.next);
             l2 = (l2 == null ? null : l2.next);
         }
         return list.next;
     }
}