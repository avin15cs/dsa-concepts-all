package Tree.GenericTree;

public class LinearizeGenericTree {
    static void linearize(CreateTree.Node node){
        for(CreateTree.Node child: node.children)
            linearize(child);

        while(node.children.size()>1){
            CreateTree.Node lc=node.children.remove(node.children.size() -1);
            CreateTree.Node sl=node.children.get(node.children.size()-1);
            CreateTree.Node slt = getTail(sl);
            slt.children.add(lc);
        }

    }

    static CreateTree.Node getTail(CreateTree.Node node){
        while(node.children.size()==1)
            node=node.children.get(0);

        return node;
    }

}
