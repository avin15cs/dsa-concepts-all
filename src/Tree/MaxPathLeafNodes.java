package Tree;

public class MaxPathLeafNodes {
    public static void main(String[] args) {
        Node root=new Node(5);
        root.right=new Node(6);
        root.right.left=new Node(-5);
        root.right.right=new Node(5);
        maxSum(root);
        System.out.println(res);
    }
    static int res=Integer.MIN_VALUE;
    static int maxSum(Node root){
        if(root==null)
            return 0;

        if (root.left == null && root.right == null)
            return root.data;
        if(root.left==null)
            return  maxSum(root.right)+root.data;

        if( root.right == null)
            return  maxSum(root.left) + root.data;

        int l=maxSum(root.left);
        int r=maxSum(root.right);


        int temp=Math.max(l,r)+root.data;
        int ans=root.data+l+r;
        res=Math.max(ans,res);
        return temp;
    }
}
