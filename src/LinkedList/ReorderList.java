package LinkedList;

public class ReorderList {
    static{
        for(int i =0;i<=500;i++){
            reorderList(new ListNode());
        }
    }
    public static void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow;
        ListNode head2 = reverse(mid);
        ListNode head1 = head;

        while(head1!=null && head2!=null){
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }

        if(head1!=null){
            head1.next = null;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
