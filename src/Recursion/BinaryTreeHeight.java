package Recursion;

public class BinaryTreeHeight {
    static class Tree {
        int data;
        Tree left, right;
        public Tree(int value){
            data = value;
            left=right=null;
        }
    }
    public static void main(String[] args) {

        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        System.out.println("Height of tree is : " + height(root));
    }
    static int height( Tree root){
        if(root==null)
            return 0;

        int lheight=height(root.left);
        int rheight=height(root.right);

        return 1 + Math.max(lheight,rheight);
//        return 1 + Math.max(height(root.left),height(root.right));
    }
}
