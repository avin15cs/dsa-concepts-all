package LinkedList.LeetCode;

import Tree.GFG.Node;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
//        ListNode n1=new ListNode(1);
//        n1.next= new ListNode(4);
//        n1.next.next=new ListNode(5);
//
//        ListNode n2=new ListNode(1);
//        n2.next= new ListNode(3);
//        n2.next.next=new ListNode(4);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode();
        ListNode n3=new ListNode(-1);

        ListNode[] lists={n1,n2,n3};
        ListNode ans=mergeKLists(lists);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
//    public static ListNode mergeKLists(ListNode[] lists) {
//        ListNode op=new ListNode();
//
//        for(ListNode k: lists) {
//            if(k.val!=0)
//            op=merge(op, k);
//        }
//        ListNode op1=op;
//        while(op.next!=null){
//            if(op.next.val==0){
//                op.next=op.next.next;
//            }
//            op=op.next;
//        }
//        return op1;
//    }
//
//    public static ListNode merge(ListNode l1,ListNode l2){
//        if(l1==null)
//            return l2;
//
//        if(l2==null)
//            return l1;
//        ListNode ans=null;
//        if(l1.val<l2.val){
//            ans=new ListNode(l1.val);
//            ans.next=merge(l1.next,l2);
//        }
//
//        else{
//            ans=new ListNode(l2.val);
//            ans.next=merge(l1,l2.next);
//        }
//
//        return ans;
//    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>();
        ListNode ans=new ListNode();

        for(ListNode listNode: lists){
            while(listNode!=null){
                pq.add(listNode);
                listNode=listNode.next;
            }
        }

        ListNode ans1=ans;
        while(!pq.isEmpty()){
            ans= pq.remove();
            ans=ans.next;
        }
        return ans1.next;
    }
}
