package LinkedList.LeetCode;

public class AddTwoNos {
    
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
//        ListNode l1=new ListNode(9);
//        l1.next=new ListNode(9);
//        l1.next.next=new ListNode(9);
//        l1.next.next.next=new ListNode(9);
//        l1.next.next.next.next=new ListNode(9);
//        l1.next.next.next.next.next=new ListNode(9);
//        l1.next.next.next.next.next.next=new ListNode(9);
//
//        ListNode l2=new ListNode(9);
//        l2.next=new ListNode(9);
//        l2.next.next=new ListNode(9);
//        l2.next.next.next=new ListNode(9);

        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(9);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        l2.next.next.next=new ListNode(9);

        ListNode ans=addTwoNumbers(l1,l2);

        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fnode = new ListNode(0),sum1=fnode;
        int carry = 0;
        while (l1 != null || l2 != null || carry==1) {
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry/=10;
            ListNode node = new ListNode(sum%10);
            fnode.next=node;
            fnode=fnode.next;
        }

        return sum1.next;
    }
}
