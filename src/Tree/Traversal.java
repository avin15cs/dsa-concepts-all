package Tree;

import java.util.Scanner;

public class Traversal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Node root = createTree();

    }

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    static void inOrder(Node root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null)
            return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null)
            return;

        System.out.println(root.data);
        postOrder(root.left);
        postOrder(root.right);
    }

    static Node createTree(){
        Node root=null;
        System.out.println("Enter data: ");
        int data=sc.nextInt();

        if(data==-1)
            return null;

        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();

        System.out.println("Enter right for "+data);
        root.right=createTree();

        return root;
    }
}
