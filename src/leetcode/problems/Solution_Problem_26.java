/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * 
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 */
public class Solution_Problem_26 {

	/*
	 * you can simply think of this as number of times the number flip in the array. 
	 * 
	 * We don't have to retain the actual array so we can just find the number of difference and add that to return length 
	 * 
	 */
	
	public int removeDuplicate(int [] input) {
		
		if(input.length<2) {
			return 1;
		}
		
		int index=1;
		
		for(int i=0;i<input.length-1;i++) {
			
			if(input[i]!=input[i+1]) {
				
				input[index]=input[i+1];
				
				index++;
			}
			
		}
		
		return index;
	}

}
