package LinkedList;

public class DetectLoop {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public static void main(String[] args) {

    }
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head,fast=head;

        while(fast!=null && fast.next!=null){

            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }

        return false;
    }
}
