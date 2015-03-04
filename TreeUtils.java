/**
 * provides methods for: comparing two trees for similarity, creating a level 0 node list
 * from a tree, creating a level N+1 node list given a level N list.
 * @author Carla Wilby
 * @version 28/02/2015
 */

public class TreeUtils {

    private BinaryTreeNode root;

    public boolean similar(BinaryTreeNode a, BinaryTreeNode b){
    if((a || b) != null){

	if(a.hasLeft() == b.hasLeft()){
	   similar(a.getLeft, b.getLeft);
        }
    }

	if(a.hasRight() == b.hasRight()){
	   similar(a.getRight, b.getRight);
        }
    
    }

}
