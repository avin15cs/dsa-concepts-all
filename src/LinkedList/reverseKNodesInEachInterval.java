package LinkedList;

public class reverseKNodesInEachInterval {
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
        head.next.next.next=new Node(11);
        Node ans=reverse(head,2);
        while(ans!=null) {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
    public static Node reverse(Node node, int k)
    {
        //Your code here

        if(node==null)
            return node;

        Node cur=node;
        Node prev=null;
        Node next=null;
        int c=0;
        while(cur!=null && c<k){
            next=cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
            c++;
        }

        node.next=reverse(next,k);

        return prev;



    }
}
