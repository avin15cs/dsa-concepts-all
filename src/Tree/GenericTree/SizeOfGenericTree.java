package Tree.GenericTree;

public class SizeOfGenericTree {
    public static int size(CreateTree.Node node){
        // write your code here
        int ans=1;
        for(CreateTree.Node child: node.children)
            ans+=size(child);

        return ans;
    }
}
