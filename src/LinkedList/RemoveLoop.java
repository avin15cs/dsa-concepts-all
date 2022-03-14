package LinkedList;

public class RemoveLoop {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {

    }

    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node meet = detectCycle(head);
        if(meet!=null){
            Node start = head;
            while(start!=meet){
                start=start.next;
                meet=meet.next;
            }
            int count=0;
            while(head!=null){

                if(head.next==meet){
                    count++;
                    if(count==2){
                        head.next=null;
                    }
                }
                head=head.next;
            }
        }
    }
    static Node detectCycle(Node head){
        Node sp,fp;
        sp=fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp)
                return sp;
        }
        return null;
    }
}
