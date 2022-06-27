package Tree;

public class DiameterOfBinaryTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
   int res=0;

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        DiameterOfBinaryTree obj=new DiameterOfBinaryTree();
        int ans=obj.diameter(root);

        System.out.println(ans);
    }

     int diameter(TreeNode root){
        if(root==null)
            return 0;

        int l=diameter(root.left);
        int r=diameter(root.right);

        int temp=1+Math.max(l,r);

        res=Math.max(res,l+r);
        return temp;
    }
}
