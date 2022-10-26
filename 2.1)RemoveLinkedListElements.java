class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        else if(head.val == val) return removeElements(head.next,val);
        else head.next = removeElements(head.next,val);
        return head;
    }
}
