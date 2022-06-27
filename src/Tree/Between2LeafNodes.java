package Tree;


import java.io.IOException;


public class Between2LeafNodes {

    public static void main(String[] args) throws IOException {
        Node root = new Node(5);
        root.right = new Node(6);
        root.right.left = new Node(-5);
        root.right.right = new Node(5);

        System.out.println(maxPathSum(root));
    }

//    static int maxSum(Node root) {
//        if (root == null)
//            return Integer.MIN_VALUE;
//
//        if (root.left == null && root.right == null)
//            return root.data;
//
//        int l = maxSum(root.left);
//        int r = maxSum(root.right);
//
//        if (root.left != null && root.right != null) {
//            int ans = root.data + l + r;
//            res = Math.max(ans, res);
//            int temp = Math.max(l, r) + root.data;
//            return temp;
//        }
//        if (root.left == null)
//            return r + root.data;
//        else
//            return l + root.data;
//    }
//    static int maxSum(Node root) {
//        if (root == null)
//            return Integer.MIN_VALUE;
//
//        if (root.left == null && root.right == null)
//            return root.data;
//
//        int l = maxSum(root.left);
//        int r = maxSum(root.right);
//
//        if (root.left != null && root.right != null) {
//            int ans = root.data + l + r;
//            res = Math.max(ans, res);
//            int temp = Math.max(l, r) + root.data;
//            return temp;
//        }
//        if (root.left == null)
//            return r + root.data;
//        else
//            return l + root.data;
//     }

    static int res = Integer.MIN_VALUE;

    static int maxSum(Node root){
        if(root==null)
            return 0;

        int l=maxSum(root.left);
        int r=maxSum(root.right);

        if(root.left==null)
            return r+root.data;

        if( root.right == null)
            return l + root.data;

        int temp=Math.max(l,r)+root.data;
        int ans=root.data+l+r;
        res=Math.max(ans,res);

        return temp;
    }
    static int maxPathSum(Node root) {
        int h=maxSum(root);
        if(root.left==null || root.right==null)
        {
            res=Math.max(res,h);
        }
        return res;
    }
}