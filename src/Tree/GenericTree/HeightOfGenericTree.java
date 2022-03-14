package Tree.GenericTree;

public class HeightOfGenericTree {
    public static int height(CreateTree.Node node) {
        // write your code here
        int maxH=-1;
        for(CreateTree.Node child: node.children){
            int ch=height(child);
            maxH=Math.max(maxH,ch);
        }

        return maxH+1;
    }
}
