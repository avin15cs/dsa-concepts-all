package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class VerticalTraversal {

    static class mm{
        int min;
        int max;
        mm(int min,int max){
            this.min=min;
            this.max=max;
        }
    }
    static mm minmax;
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.left.right=new Node(8);
        root.right.right.right=new Node(9);
        ArrayList<Integer> ans=verticalOrder(root);
        for(Integer integer:ans)
            System.out.print(integer+" ");
    }
    static HashMap<Integer, LinkedList<Integer>> map=new HashMap<>();
//    static int[] a=new int[2];
    static ArrayList<Integer> verticalOrder(Node root)
    {
        // add your code here
//        a[0]=Integer.MIN_VALUE;
//        a[1]=Integer.MAX_VALUE;
        minmax=new mm(Integer.MIN_VALUE,Integer.MAX_VALUE);
        traverse(root,0);
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i= minmax.min;i>= minmax.max;i++){
            LinkedList<Integer> list = map.get(i);
            while(!list.isEmpty())
                ans.add(list.removeFirst());
        }
        return ans;
    }

    static void traverse(Node root, int level){
        if(root==null){
//            a[0]=Math.min(level+1,a[0]);
//            System.out.print(a[0]+" ");
//            a[1]=Math.max(level-1,a[1]);
//            System.out.println(a[1]);
            minmax.min=Math.min(level+1, minmax.min);
            minmax.max=Math.max(level-1, minmax.max);
            return;
        }

        traverse(root.left,level-1);
        if(map.get(level)==null) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(root.data);
            map.put(level, list);
        }
        else{
            LinkedList<Integer> temp=map.get(level);
            temp.addLast(root.data);
        }

        traverse(root.right,level+1);
    }
}
