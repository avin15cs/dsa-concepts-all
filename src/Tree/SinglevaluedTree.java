package Tree;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SinglevaluedTree {
    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);

//            display(root);
            System.out.println(singlevalued(root));

            t--;

        }
    }

//    private static void display(Node root) {
//        while(true){
//            if(root!=null)
//            System.out.println("Root: "+root.data);
//            while(root.left!=null || root.right!=null)
//        }
//    }
    static boolean flag=false;
    public static int singlevalued(Node root)
    {
        //code here
//        if(root==null)
//            return 0;
//
//        if(root.left==null && root.right==null) {
//            flag=true;
//            return root.left == root.right ? 1 : 0;
//        }
//
//
//        int l=0,r=0;
//        l=singlevalued(root.left);
//        r=singlevalued(root.right);
//
//        if(root.left!=null && root.right!=null) {
//            if(root.left.data==root.data && root.right.data==root.data && flag)
//                return 1+l+r;
//            flag=false;
//        }
//        else if(root.left!=null) {
//            if(root.left.data==root.data && flag)
//                return 1+l+r;
//            flag=false;
//        }
//        else if(root.right!=null) {
//            if(root.right.data==root.data && flag)
//                return 1+l+r;
//            flag=false;
//        }
//        flag=false;
//        return l+r;

        if(solve(root))
            ans++;

        return ans;
    }
    static int ans=0;
    public static boolean solve(Node root){
        if(root==null)
            return true;

        // if(root.left==null || root.right==null)
        //     return root.left==root.right?true:false;

        boolean l=solve(root.left);
        boolean r=solve(root.right);

        if(l && r ) {
            if(root.left!=null && root.right!=null){
                if(root.left.data==root.data && root.data==root.right.data)
                    ans++;
                else return false;
            }
            else if(root.left!=null){
                if(root.left.data==root.data)
                    ans++;
                else return false;
            }
            else if(root.right!=null){
                if(root.right.data==root.data)
                    ans++;
                else return false;
            }
            else
                ans++;
        }
        return l && r;
    }
}
