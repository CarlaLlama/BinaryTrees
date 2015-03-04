import java.util.ArrayList;
import java.util.List;

/**
 * provides methods for: comparing two trees for similarity, creating a level 0 node list
 * from a tree, creating a level N+1 node list given a level N list.
 * @author Carla Wilby
 * @version 28/02/2015
 */

public class TreeUtils {

	/*
	 * PlaceHolder to determine null node
	 */
    public static boolean isPlaceHolder(BinaryTreeNode node){
    	if(node==BinaryTreeNode.EMPTY_NODE){
    		return true;
    	}else{
    		return false;
    	}
    }
    
	/*
	 * comparing two BinaryTreeNodes
	 */
	static boolean similar(BinaryTreeNode treeStructOne, BinaryTreeNode treeStructTwo){
		if(treeStructOne==null && treeStructTwo==null){
			return true;
		}else if(treeStructOne!=null && treeStructTwo!=null){
			return (similar(treeStructOne.getLeft(), treeStructTwo.getLeft()) && similar(treeStructOne.getRight(), treeStructTwo.getRight()));
		}else{
			return false;
		}
	}
    
	/*
	 * Add node to levelZero list
	 */
    public static List<BinaryTreeNode> levelZero(BinaryTreeNode tNode){
    	List<BinaryTreeNode> rootTree = new ArrayList<BinaryTreeNode>(); 
    	rootTree.add(tNode);
    	return rootTree;
    }
	
	/*
	 * Add nodes to nextLevel list
	 */
    public static List<BinaryTreeNode> nextLevel(List<BinaryTreeNode> level){
    	List<BinaryTreeNode> nextNodes = new ArrayList<BinaryTreeNode>(); 
    	for(int i = 0; i < level.size(); i++){
    		if((level.get(i)).hasLeft()){
    			nextNodes.add(level.get(i).getLeft());
			}else{
				nextNodes.add(BinaryTreeNode.EMPTY_NODE);
			}
    		if((level.get(i)).hasRight()){
    			nextNodes.add(level.get(i).getRight());
			}else{
				nextNodes.add(BinaryTreeNode.EMPTY_NODE);
			}
    	}
    	return nextNodes;
    }
	
}
