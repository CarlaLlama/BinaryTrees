import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class UserTreeInputTest {

	@Test
	public void testForSimilarityTrueOne() {
		int[] one = new int[]{1,2,3,40};
		int[] two = new int[]{1,2,3,35};
		SimpleBST treeOne = similarityTesting(one);
		SimpleBST treeTwo = similarityTesting(two);
		boolean result = treeOne.similar(treeTwo);
		assertEquals(true, result);
	}

	@Test
	public void testForSimilarityTrueTwo() {
		int[] one = new int[]{1,2,3,4,5,6};
		int[] two = new int[]{3,4,5,6,7,8};
		SimpleBST treeOne = similarityTesting(one);
		SimpleBST treeTwo = similarityTesting(two);
		boolean result = treeOne.similar(treeTwo);
		assertEquals(true, result);
	}
	
	@Test
	public void testForSimilarityTrueThree() {
		int[] one = new int[]{7};
		int[] two = new int[]{6};
		SimpleBST treeOne = similarityTesting(one);
		SimpleBST treeTwo = similarityTesting(two);
		boolean result = treeOne.similar(treeTwo);
		assertEquals(true, result);
	}
	
	@Test
	public void testForSimilarityFalseOne() {
		int[] one = new int[]{1,2,3,40};
		int[] two = new int[]{100,95};
		SimpleBST treeOne = similarityTesting(one);
		SimpleBST treeTwo = similarityTesting(two);
		boolean result = treeOne.similar(treeTwo);
		assertEquals(false, result);
	}
	
	@Test
	public void testForSimilarityFalseTwo() {
		int[] one = new int[]{1,2,3,4};
		int[] two = new int[]{1,2,3,4,5,6,7};
		SimpleBST treeOne = similarityTesting(one);
		SimpleBST treeTwo = similarityTesting(two);
		boolean result = treeOne.similar(treeTwo);
		assertEquals(false, result);
	}
	
	@Test
	public void testForSimilarityFalseThree() {
		int[] one = new int[]{1,2,3,4,6,7};
		int[] two = new int[]{1,2,3,5,4};
		SimpleBST treeOne = similarityTesting(one);
		SimpleBST treeTwo = similarityTesting(two);
		boolean result = treeOne.similar(treeTwo);
		assertEquals(false, result);
	}
	
	public SimpleBST similarityTesting(int[] treeValues){
		SimpleBST tree = new SimpleBST();
		tree = initializeTreesForTesting(tree, treeValues);
		return tree;
	}
	
	public SimpleBST initializeTreesForTesting(SimpleBST currentTree, int[] treeValues){
		for(int i = 0; i < treeValues.length; i++){
			currentTree.insert(i);
		}
		return currentTree;
	}
}
