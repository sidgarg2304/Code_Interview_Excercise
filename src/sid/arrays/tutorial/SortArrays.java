/**
 * 
 */
package sid.arrays.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import crack.the.coding.interview.tree.BSTTree;
import crack.the.coding.interview.tree.BSTTreeNode;

/**
 * @author siddgarg
 *
 */
public class SortArrays {
	
	
	// sorting array using binary search tree  
	
	List<Integer> array1= new ArrayList<>();
	BSTTree createbst= new BSTTree();
	BSTTreeNode root;
	int [] arr1= {1,5,6,7};
	int [] arr2= {1,2,4,3};
	int [] arr4= {10,11,8,9};
	
	public void sortArrays() {
		String str="10";
		int n= Integer.parseInt(str);
		System.out.println("can parse"+ n);
		int intiallenght=arr1.length+arr2.length;
		int totallenght=arr1.length+arr2.length+arr4.length;
		int [] arr3= new int[totallenght];
		
		// argument--- (Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length,arr2.length);
        System.arraycopy(arr4, 0, arr3, intiallenght,arr4.length);
        System.out.println("Arry 3"+ Arrays.toString(arr3));
		//Arrays.sort(arr);
		
		
		for (int i=0;i<totallenght;i++) {
			
			System.out.println("Final array--"+ arr3[i]);
			root=createbst.addBSTTreeData(arr3[i]);
			
		}
		
		createbst.treeTraversal(root);
		
		
	}
	

}
