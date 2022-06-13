public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
if(headA== null || headB == null) {
return null;
}
ListNode A = headA, B = headB;
int m = size(A);
int n = size(B);
while(m>n) {
headA = headA.next;
m--;
}
while(n>m) {
headB = headB.next;
n--;
}

    if(headA == headB) {
        return headA;
    }
    while(headA != headB) {
        headA = headA.next;
        headB = headB.next;
        if(headA == null) {
            return null;
        }
    
    }
    return headA;
}
public int size(ListNode head) {
    int count =0;
    while(head!= null) {
        head = head.next;
        count++;
    }
    return count;
}
}