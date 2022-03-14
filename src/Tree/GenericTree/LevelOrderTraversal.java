package Tree.GenericTree;

import java.util.*;

public class LevelOrderTraversal {
    public static void levelOrder(CreateTree.Node node){
        // write your code here
        Queue<CreateTree.Node> queue=new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            CreateTree.Node cur=queue.remove();
            System.out.print(cur.data + " ");

            queue.addAll(cur.children);
        }

        System.out.print(".");
    }

    public static void levelOrderLineWise(CreateTree.Node node){
        // write your code here
        Queue<CreateTree.Node> queue=new LinkedList<>();
        queue.add(node);queue.add(null);

        while(!queue.isEmpty()) {
            CreateTree.Node cur=queue.remove();
            if(cur==null){
                if(queue.isEmpty()) {
                    return;
                }
                System.out.println();
                queue.add(null);
            }
            else {
                System.out.print(cur.data + " ");
                queue.addAll(cur.children);
            }
        }
    }
    public static void levelOrderLinewiseZZ(CreateTree.Node node){
        // write your code here
        Stack<CreateTree.Node> ms=new Stack<>();
        Stack<CreateTree.Node> cs=new Stack<>();
        ms.push(node);
        int level=0;
        while(ms.size()>0){
            node=ms.pop();
            System.out.print(node.data+" ");

            if(level%2 ==1) {
                for (int i = 0; i < node.children.size(); i++) {
                    CreateTree.Node child = node.children.get(i);
                    cs.push(child);
                }
            }
            else{
                for(int i = node.children.size()-1;i>=0;i--){
                     CreateTree.Node child = node.children.get(i);
                     cs.push(child);
                }
            }
            if(ms.size()==0){
                ms=cs;
                cs=new Stack<>();
                level++;
                System.out.println();
        }
    }

    }
}

