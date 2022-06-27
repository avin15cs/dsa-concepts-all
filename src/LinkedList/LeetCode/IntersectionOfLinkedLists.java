package LinkedList.LeetCode;

public class IntersectionOfLinkedLists {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(11);
        l2.next=new ListNode(12);
        l2.next.next=new ListNode(13);
        l2.next.next.next=l1.next;

        ListNode ans=getIntersectionNode(l1,l2);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return intersect(headA,headB,headA,headB);
    }

    public static ListNode intersect(ListNode headA, ListNode headB, ListNode hA, ListNode hB) {
        if(hA==hB)
            return hA;

        if(hA==null)
            return intersect(headA,headB,headB,hB.next);

        if(hB==null)
            return intersect(headA,headB,hA.next,headA);

        return intersect(headA, headB, hA.next, hB.next);

    }
}
