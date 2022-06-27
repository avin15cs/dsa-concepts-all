package LinkedList;

public class RemoveNthNodeFromLast {

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
//        head.next.next=new ListNode(3);
//        head.next.next.next=new ListNode(4);
//        head.next.next.next.next=new ListNode(5);
        ListNode ans=removeNthFromEnd(head,2);

        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
//         if(n==1)
//             return head.next;

        ListNode cur=head;
        int k=0;
        while(cur!=null){
            cur=cur.next;
            k++;
        }
        n=k-n;
        cur=head;
        for(int i=1;i<n;i++){
            cur=cur.next;
        }

        cur.next=cur.next.next;

        return head;
    }
}
