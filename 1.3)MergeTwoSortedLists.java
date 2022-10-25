class Solution{
    public ListNode mergeTwoLists(ListNode h1,ListNode h2){
        if(h1==null) return h2;
        else if(h2==null) return h1;
        else{
            if(h1.val<h2.val){
                h1 = mergeTwoLists(h1.next,h2);
                return h1;
            }else{
                h2 = mergeTwoLists(h1,h2.next);
                return h2;
            }
        }
    }
}
