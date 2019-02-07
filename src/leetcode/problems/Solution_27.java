/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.


 *
 */
public class Solution_27 {
	
	int finalLength;
	
	public int removeDuplicate( int [] nums, int val) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				finalLength++;
			}else {
				
				int j=i+1;
				
				while(j<nums.length) {
					
					if(nums[j]!=val) {
						
						int temp =nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
						finalLength++;
						break;
						
					}else {
						j++;
					}
					
				}
				
			}
		}
		
		for(int k=0;k<finalLength;k++) {
			System.out.println("Final array List --" + nums[k]);
		}
		
		return finalLength;
	}

}
