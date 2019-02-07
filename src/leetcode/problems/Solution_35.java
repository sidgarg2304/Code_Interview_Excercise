/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * 
 * 
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.


 *
 */
public class Solution_35 {
	
	int index;
	
	public int findIndex(int [] input, int target) {
		
		int low=0;
		int high= input.length-1; 
		
	     index=binarySearch(input,target,low,high);
		
		return index;
		
	}
	
	
	public int binarySearch(int nums[], int search,int lows, int highs) {
		
		
		if(lows>highs) {
			
			return lows;
		}
		
		int mid = lows + ((highs-lows)/2);
		
	
		
		if(nums[mid]==search) {
			return mid;
		}
		
		if(nums[mid]>search) {
			
			return binarySearch(nums,search,lows,mid-1);
			
		}else {
			
			return binarySearch(nums,search,mid+1,highs);
		}
		
		
		
	}
	
	
	

}
