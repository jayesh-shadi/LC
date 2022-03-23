public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null||head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        
        int flag=0;
        while(fast.next!=null && fast.next.next!=null)//---(i)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return null;
        
        while(slow!=temp)
        {
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
}
/*(i) fast.next!=null is for checking in even length list 
& fast.next.next!=null is for checking in odd length list
in any case if one of them is false , the loop will break , courtesy of && operator*/