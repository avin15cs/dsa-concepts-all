package LinkedList;

public class DeleteNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(3);
//        head.next.next=new Node(6);
//        head.next.next.next=new Node(9);

        Node ans=deleteNode(head,2);
        while(ans!=null) {
            System.out.println(ans.data);
            ans=ans.next;
        }
    }
    static Node deleteNode(Node head, int x)
    {
        // Your code here
        Node h=head;
        Node prev=null;
        while(head!=null && x>1){
            prev=head;
            head=head.next;
            x--;
        }

        if(head.next!=null){
            head.data=head.next.data;
            head.next=head.next.next;
        } else{
            prev.next=null;
        }

        return h;
    }
}
