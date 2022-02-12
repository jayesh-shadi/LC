class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // base condition
        if(lists == null) return null;
        if(lists.length == 0) return null;
        // convert linked list to arraylist
        ArrayList<Integer> res=new ArrayList();
        for(ListNode temp : lists){
            while(temp!=null){
                res.add(temp.val);
                temp=temp.next;
            }
        }
        
        // sort arraylist
        Collections.sort(res);
        // convert to array
        Integer [] ans=new Integer[res.size()];
        res.toArray(ans);
        // if its empty
        if(ans.length==0) return null;
        // head which we will return
        ListNode head=new ListNode(ans[0]);
        // temp to add all the elements in the list
        ListNode temp=head;
        for(int i=1;i<ans.length;i++){
            temp.next=new ListNode(ans[i]);
            temp=temp.next;
        }
        return head;
    }
}