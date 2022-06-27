package Tree.GFG.Level1;

import Tree.GFG.Node;

public class MirrorTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(2);
        root.right.left=new Node(5);
        root.right.right=new Node(4);

        mirrorTree(root);
        System.out.println("Done");
    }
    static void mirrorTree(Node root){
        if(root==null)
            return;

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        mirrorTree(root.left);
        mirrorTree(root.right);
    }
}
