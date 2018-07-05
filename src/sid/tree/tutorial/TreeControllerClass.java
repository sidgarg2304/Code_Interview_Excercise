/**
 * 
 */
package sid.tree.tutorial;

import crack.the.coding.interview.tree.BSTTree;
import crack.the.coding.interview.tree.BSTTreeNode;

/**
 * @author siddgarg
 *
 */
public class TreeControllerClass {
	
	public static void main(String [] args) {
		
		int i=1/2;
		System.out.println("Value of i"+ i);
		
		BSTTree bt= new BSTTree();
		CreateLinkedListfromTree cllt= new CreateLinkedListfromTree();
		BSTTreeNode root;
		root=bt.addBSTTreeData(5);
		//System.out.println("First"+ root.);
		root=bt.addBSTTreeData(1);
		System.out.println("second"+ root.data);
		root=bt.addBSTTreeData(2);
		//System.out.println("third"+ root.data);
		root=bt.addBSTTreeData(3);
		//System.out.println("fourth"+ root.data);
		root=bt.addBSTTreeData(6);
		
		//bt.traversalTree(root);
		cllt.printTreeLevelByLevelBFS(root);
		
	}

}
