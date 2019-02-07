/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).
 *
 */
public class Soution_33 {
	
	/*
	 * Looks like if we move from left to right . Till the pivot , Left is always smaller than right 
	 * 
	 * going to use this condition
	 * 
	 */
	
	public int search( int[] nums, int target)
	{
		int index=-1;
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]>nums[i+1] && nums[i+1]==target) {
				
				index=i+1;
				
			}
		}
		
		
		
		return index;
		
		
		
		
	
	}
	
	/*
	 * binary search works mostly with sorted array otherwise sort the array first or use other algorithm
	 * 
	 */
	
	
	public int binarySearch(int sarr[], int low, int high, int key) {
		
		int index = 0;
		
		
		if(high<low) {
			
			return -1;
			
		}
		
		int mid = (low+high)/2;
		
		if(sarr[mid]==key) {
			return mid;
		}
		
		if(key>mid)
			return binarySearch(sarr,(mid+1),high,key);
		return binarySearch(sarr,low,(mid-1),key);
		
		
		
	}
	
}
