package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderMaximum {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        ArrayList<Integer> ans=largestValues(root);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> largestValues(Node root)
    {
        Queue<Node> pq=new LinkedList<>();
        pq.add(root);pq.add(null);

        ArrayList<Integer> ans=new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            Node cur=pq.remove();
            if(cur==null){
                ans.add(max);
                max=Integer.MIN_VALUE;
                if(pq.isEmpty()){
                    break;
                }
                else{

                    pq.add(null);
                }

            }
            else{
                max=Math.max(max,cur.data);
                if(cur.left!=null)
                    pq.add(cur.left);
                if(cur.right!=null)
                    pq.add(cur.right);
            }
        }
        return ans;
    }
}
