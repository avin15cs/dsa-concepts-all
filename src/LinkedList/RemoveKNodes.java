package LinkedList;


public class RemoveKNodes {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode ans=reverse(head,2);

        while(ans!=null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        while (pointer != null) {
            ListNode node = pointer;
            // first check whether there are k nodes to reverse
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) break;

            // now we know that we have k nodes, we will start from the first node
            ListNode prev = null, curr = pointer.next, next = null;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode tail = pointer.next;
            tail.next = curr;
            pointer.next = prev;
            pointer = tail;
        }
        return dummy.next;
    }

    public static ListNode reverse(ListNode head, int k){
        ListNode next=null;
        ListNode prev=null;
        int c=0;
        ListNode cur=head;
        while(cur!=null && c<k){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            c++;
        }
        if(next!=null)
            head.next=reverse(next,k);

        return prev;
    }
}
