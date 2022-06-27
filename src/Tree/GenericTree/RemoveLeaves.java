package Tree.GenericTree;

import java.util.ArrayList;

public class RemoveLeaves {

    static void removeLeaves(CreateTree.Node node){

        for(int i = node.children.size()-1;i>=0;i--){
            CreateTree.Node child=node.children.get(i);
            if(child.children.size()==0)
                node.children.remove(child);
        }

        for(CreateTree.Node child: node.children)
            removeLeaves(child);


    }
}
