package LinkedList.LeetCode;

public class RotateList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        ListNode ans=rotateRight(l1,2);

        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
            return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;

        int n;
        for(n=0;fast.next!=null;n++)
            fast=fast.next;

//        for(int j=n-k%n;j>0;j--)
//            slow=slow.next;

        for(int j=0;j<n-k%n;j++)
            slow=slow.next;

        fast.next=dummy.next;
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }
}
