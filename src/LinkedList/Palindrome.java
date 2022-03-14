package LinkedList;

public class Palindrome {

    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    boolean isPalindrome(Node head)
    {
        //Your code here

        Node mid=getMid(head);
        Node rev=reverse(mid);

        while(rev!=null){
            if(head.data!=rev.data)
                return false;

            head=head.next;
            rev=rev.next;
        }

        return true;
    }

    Node getMid(Node head){

        Node fast=head, slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    Node reverse(Node head){
        Node cur=head;
        Node next=null;
        Node prev=null;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
        }

        return prev;
    }
}
