class Solution{
    public boolean isPalindrome(ListNode head){
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode rev=reverse(slow),temp=head;
        while(temp!=null){
            if(rev.val!=temp.val) return false;
            temp=temp.next;
            rev=rev.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode cur){
        ListNode prev=null,next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
