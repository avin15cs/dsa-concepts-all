package Tree;

import static Tree.Traversal.createTree;

public class SizeOfTree {
    public static void main(String[] args) {
        Traversal.Node node=createTree();
        System.out.println("SizeOfTree of Tree:"+size(node));
    }
    static int size(Traversal.Node root){
        if(root==null)
            return 0;
        int l=size(root.left);
        int r=size(root.right);
        return 1+l+r;
    }
}
