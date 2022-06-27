package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTraversal {
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
        ArrayList<Integer> ans=zigZagTraversal(root);
        System.out.println(ans.toString());
    }
    static ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> node=new LinkedList<>();
        node.add(root);node.add(null);
        ArrayList<Integer> temp=new ArrayList<>();
        int level=0;
        while(!node.isEmpty()){
            Node cur=node.remove();

            if(cur==null){
                if(level%2==0)
                    ans.addAll(temp);
                else {
                    Collections.reverse(temp);
                    ans.addAll(temp);
                }
                if(node.isEmpty()){
                    break;
                }

                else{
                    temp=new ArrayList<>();
                    level++;
                    node.add(null);
                }
            }
            else{
                temp.add(cur.data);
                if(cur.left!=null)
                    node.add(cur.left);

                if(cur.right!=null)
                    node.add(cur.right);
            }
        }
        return ans;
    }
}
