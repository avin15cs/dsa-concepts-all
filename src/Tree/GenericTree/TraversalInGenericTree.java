package Tree.GenericTree;

public class TraversalInGenericTree {
    public static void traversals(CreateTree.Node node){
        System.out.println("Node Pre "+node.data);
        for(CreateTree.Node child: node.children){
            System.out.println("Edge Pre "+node.data+"--"+child.data);
            traversals(child);
            System.out.println("Edge Post "+node.data+"--"+child.data);
        }
        System.out.println("Node Post "+node.data);

    }
}
