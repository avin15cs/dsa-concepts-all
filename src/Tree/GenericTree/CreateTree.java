package Tree.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class CreateTree {
    public static class Node {
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }
    public static void main(String[] args) {
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = null;
        Stack<Node> stack = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == -1)
                stack.pop();

            else{
                Node t= new Node();
                t.data=arr[i];

                if(stack.size()>0) {
                    stack.peek().children.add(t);
                }
                else
                    root=t;
                stack.push(t);
            }
        }
        display(root);
        int size=SizeOfGenericTree.size(root);
        System.out.println("Size of Generic Tree: "+ size);

        int height=HeightOfGenericTree.height(root);
        System.out.println("Height of Generic Tree: "+height);

//        TraversalInGenericTree.traversals(root);
//        LevelOrderTraversal.levelOrderLineWise(root);
//        LevelOrderTraversal.levelOrderLinewiseZZ(root);
//        MirrorOfTree.mirror(root);
        RemoveLeaves.removeLeaves(root);
        display(root);
    }

    //d(10) -> 10 will print itself and its family
    //d(20), d(30), d(40) will print themselves and their families
    //d(10) = s(10) + d(10) + d(20) + d(30)+ d(40)

    public static void display(Node node){
        if(node==null)
            return;
        String str = node.data+" -> ";
        for(Node child: node.children)
            str += child.data+",";
        str+=".";
        System.out.println(str);

        for(Node child: node.children)
            display(child);
    }
}
