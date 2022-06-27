package LinkedList.LeetCode;

public class ReverseLinkedListii {
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

        ListNode ans=reverseBetween(head,2,4);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode l=dummy;
        for(int i=1;i<left;i++)
            l=l.next;

        ListNode r=dummy;
        for(int i=1;i<right;i++)
            r=r.next;


        ListNode prev=r.next;
        while(right-left+1>0){
            ListNode temp=l.next;
            l.next=prev;

            prev=l;
            l=temp;

            right--;
        }

        l.next=prev;

        return dummy.next;
    }
}
