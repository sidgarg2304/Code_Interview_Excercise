/**
 * 
 */
package crack.the.coding.interview.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sid.tree.tutorial.CreateLinkedListfromTree;

/**
 * @author siddgarg
 *
 */

// question 4.2 tree and graph
public class BSTTreeController {
	
	
	
	public static void main(String [] args) {
		BSTTreeNode rootNode;
		List<LinkedList<BSTTreeNode>> treelistarrayfinal= new ArrayList<>();
		int [] testData= {1,2,3,4,5,6};
		BSTTree bstTree = new BSTTree();
		CreateLinkedListfromTree arrayList= new CreateLinkedListfromTree();
		int n=testData.length/2;
		int rootData=testData[n];
		rootNode=bstTree.addBSTTreeData(rootData);
		for(int i=0;i<testData.length;i++) {
			if(testData[i]!=rootData) {
				rootNode=bstTree.addBSTTreeData(testData[i]);
				
			}
		}
		bstTree.treeTraversal(rootNode);
		treelistarrayfinal=arrayList.generateList(rootNode);
		int finalsizearray=treelistarrayfinal.size();
		System.out.println("size of the array"+finalsizearray);
		
	}

}
