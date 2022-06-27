package LinkedList.LeetCode;

public class MergeNodesInBetweenZeros {
    public static void main(String[] args) {
        ListNode l2=new ListNode(0);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        l2.next.next.next=new ListNode(0);
        l2.next.next.next.next=new ListNode(1);
        l2.next.next.next.next.next=new ListNode(2);
        l2.next.next.next.next.next.next=new ListNode(5);
        l2.next.next.next.next.next.next.next=new ListNode(0);

        ListNode ans=merge(l2);

        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }

    //Iterative Approach
    public static ListNode mergeNodes(ListNode head) {
        if(head.next==null)
            return head;

        ListNode prev=new ListNode(0);
        ListNode ans=prev;
        ListNode cur=head.next;
        while(prev!=null && cur!=null){
            int sum=0;
            while( cur.val!=0){
                sum=sum+cur.val;
                cur=cur.next;
            }
            prev.next=new ListNode(sum);
            prev=prev.next;

            cur=cur.next;
        }

        return ans.next;
    }

    //Recursive & Iterative Approach
    public static ListNode merge(ListNode head) {
        if(head.next==null)
            return null;

        ListNode calc=head.next;
        int sum=0;
        while(calc.val!=0){
            sum+= calc.val;
            calc=calc.next;
        }

        head.next.val=sum;
        head.next.next=merge(calc);

        return head.next;
    }
}
