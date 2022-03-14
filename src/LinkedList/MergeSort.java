package LinkedList;

import java.util.LinkedList;

public class MergeSort {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head =new Node(3);
        head.next=new Node(5);
        head.next.next=new Node(2);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(1);
        Node ans=mergeSort(head);
        while(ans!=null) {
            System.out.print(ans.data);
            ans=ans.next;
        }
    }
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head== null || head.next== null)
            return head;

        Node mid=middle(head);
        Node aftermid=mid.next;
        mid.next=null;

        Node left=mergeSort(head);
        Node right=mergeSort(aftermid);

        Node sortedList=merge(left,right);
        return sortedList;
    }

    static Node middle(Node head){

        if(head==null)
            return head;

        Node slow=head, fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    static Node merge(Node a, Node b){

        if(a==null)
            return b;

        if(b==null)
            return a;

        Node ans=null;
        if(a.data <= b.data){
            ans=a;
            ans.next=merge(a.next,b);
        }
        else{
            ans=b;
            ans.next=merge(a, b.next);
        }

        return ans;
    }
}
