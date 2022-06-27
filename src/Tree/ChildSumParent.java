package Tree;

public class ChildSumParent {
    public static int isSumProperty(Node root)
    {
        // add your code here
        return (isSum(root))?1:0;

    }

    static boolean isSum(Node root){
        if(root==null)
            return true;

        int l=0;
        if(root.left!=null)
            l=root.left.data;

        int r=0;
        if(root.right!=null)
            r=root.right.data;

        boolean ans=(l+r==root.data);
        return ans && isSum(root.left) && isSum(root.right);
    }
}
