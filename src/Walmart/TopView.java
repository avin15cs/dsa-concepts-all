package Walmart;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class Pair{
    Node node;
    int pos;
    Pair(Node n, int pos){
        this.node=n;
        this.pos=pos;
    }
}

public class TopView {
    public static void main(String[] args) {

    }

    ArrayList<Integer> topview(Node root){

        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));

        while(!queue.isEmpty()){
            Pair it=queue.remove();
            int level=it.pos;
            Node temp=it.node;

            if(map.get(level)==null)
                map.put(level,temp.data);

            if(temp.left!=null)
                queue.add(new Pair(temp.left,level-1));

            if(temp.right!=null)
                queue.add(new Pair(temp.right,level+1));

        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
