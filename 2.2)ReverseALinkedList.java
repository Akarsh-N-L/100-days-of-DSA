class Solution{
    public ListNode reverseList(ListNode head){
        ListNode cur=head,prev=null,next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
}
