package LinkedList;

public class DeleteMiddleElement {

    public static void main(String[] args) {
        Node head =new Node(3);
        head.next=new Node(5);
        head.next.next=new Node(2);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(1);
        Node ans=deleteMid(head);
        while(ans!=null) {
            System.out.print(ans.data);
            ans=ans.next;
        }
    }
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    static class setNode{
        Node prev,cur;

        setNode(Node prev, Node cur){
            this.prev=prev;
            this.cur=cur;
        }
    }
    static Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        setNode node=getMid(head);
        Node prev=node.prev;
        Node cur=node.cur;

        prev.next=cur.next;

        return head;

    }

    static setNode getMid(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }

        return (new setNode(prev,slow));
    }
}
