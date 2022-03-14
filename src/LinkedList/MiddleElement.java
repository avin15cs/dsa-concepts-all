package LinkedList;

public class MiddleElement {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(6);
        head.next=new Node(49);
        head.next.next=new Node(30);
        head.next.next.next=new Node(11);
        head.next.next.next.next=new Node(13);

        int ans=getMiddle(head);
        System.out.println(ans);
    }
    static int getMiddle(Node head)
    {
        // Your code here.
        if(head==null)
            return -1;

//        if(head.next==null)
//            return head.data;

//        if(head.next.next==null)
//            return head.data;

        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

//        if(fast!=null && fast.next==null)
//            return slow.data;

        return slow.data;
    }

}
