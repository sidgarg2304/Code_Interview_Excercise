/**
 * 
 */
package crack.the.coding.interview.tree;

/**
 * @author siddgarg
 *
 */
public class BSTTree {
	
	BSTTreeNode root;
	
	// recursive fucntion to enter data in a binary search tree
	public BSTTreeNode createBST(BSTTreeNode root,int data) {
		
		if(root==null) {
			return new 	BSTTreeNode(data);
		}else if (root.data<data) {
			root.rightNode=createBST(root.rightNode,data);
			
		}else if(root.data>data){
			root.leftNode=createBST(root.leftNode,data);
			
		}
		return root;
		
	}
	
	
	public BSTTreeNode addBSTTreeData(int data) {
		root=createBST(root,data);
		return root;
	}
	
	// tree node only holds value to right and left node , it is not like a double linkedList
	public void treeTraversal(BSTTreeNode root) {
		
		if(root!=null) {
		treeTraversal(root.leftNode);
		System.out.print(root.data);
		treeTraversal(root.rightNode);
		}
	
		
	}

}
