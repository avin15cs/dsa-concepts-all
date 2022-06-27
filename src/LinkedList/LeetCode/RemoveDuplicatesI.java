package LinkedList.LeetCode;

public class RemoveDuplicatesI {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(1);
        l1.next.next=new ListNode(2);
        l1.next.next.next=new ListNode(3);
        l1.next.next.next.next=new ListNode(3);
        l1.next.next.next.next.next=new ListNode(3);
        l1.next.next.next.next.next.next=new ListNode(3);
        ListNode ans=deleteDuplicates(l1);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
//        ListNode dummy=new ListNode(0);
//        ListNode temp=dummy;
//
//        while(head!=null){
//            if(head.val!=temp.val){
//                temp.next=head;
//                temp=temp.next;
//            }
//            head=head.next;
//        }
//        temp.next=null;
//        return dummy.next;

        ListNode temp = head;

        while(temp!=null&&temp.next!=null){

            if(temp.val == temp.next.val){

                temp.next = temp.next.next;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}
