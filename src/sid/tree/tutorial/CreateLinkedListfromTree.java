/**
 * 
 */
package sid.tree.tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import crack.the.coding.interview.tree.BSTTree;
import crack.the.coding.interview.tree.BSTTreeNode;

/**
 * @author siddgarg
 *
 */
// linkedlist of all the nodes at same depth
public class CreateLinkedListfromTree {
	
	BSTTree rootNode;
	
	List<LinkedList<BSTTreeNode>> treelistarray= new ArrayList<>();
	
	
	
	public List<LinkedList<BSTTreeNode>> generateList(BSTTreeNode rootNode) {
		createLevelLinkedList(rootNode,treelistarray,0);
		return treelistarray;		
	}
	
	public void createLevelLinkedList(BSTTreeNode root,List<LinkedList<BSTTreeNode>> treelistarray,int level) {
		
		// base case
		if(root==null) {
			return ;}
			
		
			LinkedList<BSTTreeNode> list=null;
			// when first reaching this point we add an empty list to the array
			if(treelistarray.size()==level) {
				
				list=new LinkedList<>();
				
				treelistarray.add(list);
				
				
			}else {
				// get existing list from the array 
				list=treelistarray.get(level);
			}
			
			// then we update that list to root
			list.add(root);
			createLevelLinkedList(root.rightNode,treelistarray,level+1);
			createLevelLinkedList(root.leftNode,treelistarray,level+1);
			
			
			
			
		}
	
	// print tree using breath first 
	
	public void printTreeLevelByLevelBFS(BSTTreeNode root) {
		
		//array of linkeList to store tree node 
		
		List<LinkedList<BSTTreeNode>> result= new ArrayList<>();
		if(root!=null) {
			LinkedList<BSTTreeNode> current= new LinkedList<>();
			current.add(root);
		 while(current.size()>0) {
			 result.add(current);
			 LinkedList<BSTTreeNode> parent= new LinkedList<>();
			 LinkedList<String> test= new LinkedList<>();
			 parent=current;
			 current= new LinkedList<BSTTreeNode>();
			 System.out.print("\n");
			 for (BSTTreeNode parents:parent) {
				 System.out.print("Tree Structure"+parents.data);
				 // here you are referencing a pointer to left or right node . 
				 // null is not a valid datatype for BSTTreeNode
				 //current.add(null);
				 // below addition works because it allows null for string but not for Tree Node that is custom type
				 test.add(null);
				 // check if parent has left or right node instead of sending null values
				 if(parents.leftNode!=null)
				 current.add(parents.leftNode);
				 if(parents.rightNode!=null)
				 current.add(parents.rightNode);
				 
			 }
			 
			 
		 }
			
			
		}
		
		
		
		
		
	}
	

}
