package Walmart;

public class AddTwoNos {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        l1.next=new ListNode(9);
        l1.next.next=new ListNode(9);
        l1.next.next.next=new ListNode(9);
        l1.next.next.next.next=new ListNode(9);
        l1.next.next.next.next.next=new ListNode(9);
        l1.next.next.next.next.next.next=new ListNode(9);

        ListNode l2=new ListNode(9);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(9);

        ListNode ans=addTwoNumbers(l1,l2);
        System.out.println(ans.toString());
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode op=new ListNode(0);
        ListNode dummy=op;

        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            //Take value from l1 node
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }

            //Take value from l2 node
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            //Add carry
            sum+=carry;
            carry=sum/10;

            //create node with latest sum
            ListNode node=new ListNode(sum%10);

            //link op node with sum
            op.next=node;
            op=op.next;
        }

        return dummy.next;

    }
}
