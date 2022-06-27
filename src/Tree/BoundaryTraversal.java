package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BoundaryTraversal {

    static Node buildTree(String str)
    {
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

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Node root = buildTree(s);

        ArrayList<Integer> op=boundary(root);
        for(Integer integer: op)
            System.out.print(integer+" ");
    }
    static ArrayList<Integer> ans=new ArrayList<>();
    static ArrayList <Integer> boundary(Node root)
    {
        if(root==null)
            return ans;
        ans.add(root.data);
        //First part
        left(root.left);

        //Second Part
        leaf(root.left);
        leaf(root.right);

        //Third Part
        right(root.right);

        return ans;
    }

    static void left(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        ans.add(root.data);
        if(root.left!=null)
            left(root.left);
        else
            left(root.right);
    }

    static void leaf(Node root){
        if(root==null)
            return;

        if(root.left==null && root.right==null){
            ans.add(root.data);
            return;
        }
        leaf(root.left);
        leaf(root.right);
    }

    static void right(Node root){
        if(root==null)
            return;

        if(root.left==null && root.right==null)
            return;

        if(root.right!=null)
            right(root.right);
        else
            right(root.left);
        ans.add(root.data);
    }

}
