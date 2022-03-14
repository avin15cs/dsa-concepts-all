package LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head =new Node(2);
        head.next=new Node(2);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);

        Node ans=removeDuplicates(head);
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

    static Node removeDuplicates(Node head)
    {
        // Your code here
        Node ele=head;
        Node temp=head;
        while(ele!=null){
            temp=ele;
            int freq=0;
            int val=ele.data;
            while(temp!=null && temp.data==val){
                freq++;temp=temp.next;
            }
            ele.next=temp;
            ele=ele.next;

        }

        return head;
    }
}
