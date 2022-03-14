package Tree.GenericTree;

import java.util.Collections;

public class MirrorOfTree {
    public static void mirror(CreateTree.Node node){
        // write your code here
        for(CreateTree.Node child: node.children){
            mirror(child);
        }
        Collections.reverse(node.children);
    }
}
