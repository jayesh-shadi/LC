/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Boolean iscycle=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                iscycle=true;
                break;
            }
        }
          if(iscycle==false)
          {
               return null;
          }
           
        ListNode temp = head;
        
        while(temp!=slow)
        {
            temp=temp.next;
            slow=slow.next;
            
        }
        return temp;
    }
}