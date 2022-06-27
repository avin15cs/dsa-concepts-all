package LinkedList.LeetCode;

public class RemoveDuplicates {
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
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(4);
        ListNode ans= deleteDuplicates(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        ListNode first=new ListNode(0);
        ListNode ans=first;
        while(node!=null){
            int freq=0;
            ListNode temp=node;
            while(temp!=null && temp.val==node.val){
                freq++;
                temp=temp.next;
            }
            if(freq==1){
                first.next=node;
                first=first.next;
                node=node.next;
            }
            else{
                node=temp;
            }
        }
        first.next=null;
        return ans.next;
    }
}
