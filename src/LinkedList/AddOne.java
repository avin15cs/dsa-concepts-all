package LinkedList;

public class AddOne {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head =new Node(2);
        head.next=new Node(9);
        head.next.next=new Node(9);

        Node ans=addOne(head);
        while(ans!=null) {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
    public static Node addOne(Node head)
    {
        //code here.
        if(head.next == null){
            head.data++;
            return head;
        }
        Node node = addOne(head.next);

        head.data += node.data /10;
        node.data = node.data %10;
        return head;
    }
}
