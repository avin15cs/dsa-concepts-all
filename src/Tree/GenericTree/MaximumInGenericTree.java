package Tree.GenericTree;

public class MaximumInGenericTree {
    public static int max(CreateTree.Node node) {
        int max = Integer.MIN_VALUE;

        for (CreateTree.Node child : node.children) {
            int cm = max(child);
            max=Math.max(cm,max);
        }

        max=Math.max(node.data,max);
        return max;
    }
}
