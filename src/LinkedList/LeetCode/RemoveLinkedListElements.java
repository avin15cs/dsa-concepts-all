package LinkedList.LeetCode;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
//        ListNode l1=new ListNode(1);
//        l1.next=new ListNode(2);
//        l1.next.next=new ListNode(6);
//        l1.next.next.next=new ListNode(4);
//        l1.next.next.next.next=new ListNode(6);

        ListNode l1=new ListNode(7);
        l1.next=new ListNode(7);
        l1.next.next=new ListNode(7);
        l1.next.next.next=new ListNode(7);
//        l1.next.next.next.next=new ListNode(6);
        ListNode ans=removeElements(l1,7);

        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        //Recursive Approach
//         if(head==null)
//             return null;

//         if(head.val==val){
//             if(head.next==null)
//             head.next=
//         }
//        while (head != null && head.val == val) head = head.next;
        ListNode cur=new ListNode(0);
//        ListNode node = cur;
        cur.next=head;
        while(cur!=null && cur.next!=null){
            if(cur.next.val==val)
                cur.next=cur.next.next;

            else
                cur=cur.next;
        }

        return head;
    }
}
