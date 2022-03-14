package Tree;

public class HeightOfTree {

    public static void main(String[] args) {
        Traversal.Node node=Traversal.createTree();
        System.out.println("Height of Tree: "+height(node));
    }
    static int height(Traversal.Node root){
        if(root==null)
            return 0;
        int l=height(root.left);
        int r=height(root.right);

        return 1+Math.max(l,r);
    }
}
