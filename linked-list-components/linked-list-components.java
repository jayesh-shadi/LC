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
    public int numComponents(ListNode head, int[] nums) {
        int[] freq=new int[10005];
        int count=0;
        for(int i:nums)
        {
            freq[i]++;
        }
        while(head!=null)
        {
            int v=head.val;
            if(freq[v]>0)
            {
                while(head!=null && freq[head.val]>0)
                {
                    head=head.next;
                   
                } count++;
            }
            else{
                head=head.next;
            }
        }
        return count;
    }
}