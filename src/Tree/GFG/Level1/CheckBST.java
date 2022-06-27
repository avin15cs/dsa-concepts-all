package Tree.GFG.Level1;

import Tree.GFG.Node;

public class CheckBST {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.left.right=new Node(4);
        root.left.right=new Node(9);
        root.left.right.left=new Node(8);
        root.right=new Node(18);
        root.right.left=new Node(15);
        root.right.left.right=new Node(1);
        root.right.right=new Node(19);


        if(isBST(root))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean res=true;
    static boolean isBST(Node root)
    {
        // code here.
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;

        if(!res)
            return false;

        int l=0,r=0;
        if(root.left!=null)
            l=root.left.data;

        if(root.right!=null)
            r=root.right.data;

        if(root.data>l && root.data<r)
            return isBST(root.left) && isBST(root.right);


        return res=false;
    }
}
