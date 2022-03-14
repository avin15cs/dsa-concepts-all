package Tree.GenericTree;

public class RemoveLeaves {
//    public static CreateTree.Node removeLeaves(CreateTree.Node node) {
//        // write your code here
//        if(node==null)
//            return null;
//
//        if(node.children.size()==0){
//            return null;
//        }
//
//        for(int i = 0;i<node.children.size();i++){
//            node.children.set(node.children.get(i),removeLeaves(node.children.get(i)));
//        }
//        return node;
//    }
    public static void removeLeaves(CreateTree.Node node) {
        // write your code here
        if (node == null)
            return;

        if (node.children.size() == 0) {
            node = null;
            return;
        }

        for (CreateTree.Node child : node.children) {
            removeLeaves(child);
        }
    }
}
