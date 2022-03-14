package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLV {
//    Node root;
//    BinaryTreeLV(){
//        root = null;
//    }
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
        public static void main(String[] args) {
//            BinaryTreeLV tree =new BinaryTreeLV();
//            tree.root = new Node(1);
//            tree.root.left = new Node(2);
//            tree.root.right = new Node(3);
//            tree.root.left.left = new Node(4);
//            tree.root.left.right = new Node(5);

            Node node = new Node(1);
            node.left=new Node(2);
            node.right=new Node(3);
            ArrayList<Integer> ans= leftView(node);
            System.out.println(ans);
        }
//  static ArrayList<Integer> leftView(Node root)
//    {
//        // Your code here
//        ArrayList<Integer> a=new ArrayList<>();
//
//        Queue<Node> q=new LinkedList<>();
//        q.add(root);q.add(null);
//        while((q.peek()==null) ^ (!q.isEmpty())){
//            Node node=q.peek();
//            if(node!=null)
//                a.add(node.data);
//
//            if(q.peek()!=null) {
//                while (q.peek() != null) {
//                    Node n = q.remove();
//                    if (n.left != null)
//                        q.add(n.left);
//                    if (n.right != null)
//                        q.add(n.right);
//                }
//                q.remove();
//                q.add(null);
//            }


//        }
//        return a;
//    }
//static ArrayList<Integer> leftView(Node root)
//{
//    ArrayList<Integer> a=new ArrayList<>();
//
//    Queue<Node> q=new LinkedList<>();
//    q.add(null);
//    q.add(root);
//    q.add(null);
//    while(!q.isEmpty()){
//        q.remove();
//        if(q.peek()!=null){
//            Node node=q.peek();
//            a.add(node.data);
//            while (q.peek() != null) {
//                node = q.remove();
//                if (node.left != null)
//                    q.add(node.left);
//                if (node.right != null)
//                    q.add(node.right);
//
//            }
//            q.add(null);
//        }
//
//
//    }
//    return a;
//}
    static ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> a=new ArrayList<>();

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            int i = 0;
            while (i<s) {
                Node node = q.remove();
                if (i == 0) a.add(node.data);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                i++;
                }
            }
        return a;
    }
}
