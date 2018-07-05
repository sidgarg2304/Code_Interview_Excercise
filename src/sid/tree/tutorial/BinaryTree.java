/**
 * 
 */
package sid.tree.tutorial;

/**
 * @author siddgarg
 *
 */
public class BinaryTree {
	
	TreeNode root;
	
	public TreeNode addRecursive(TreeNode current,int data) {
		if(current==null) {
			return new TreeNode(data);
		}
		if(data<current.data) {
			current.left= addRecursive(current.left,data); 
		}else if(data>current.data){
			current.right=addRecursive(current.right,data); 
			
		}else {
			return current;
		}
		
		return current;
		
		
	}
	
	public TreeNode add(int data) {
		root=addRecursive(root,data);
		return root;
	}
	
	
	public void traversalTree(TreeNode root) {
		if(root!=null) {
			traversalTree(root.left);
			System.out.println("---"+root.data);
			traversalTree(root.right);
			
			
		}
		
	}

}
