/**
 * 
 */
package leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author siddgarg
 *
 */

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = {2, 7, 11, 15}, target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class Solution_1 {
	
	
	
	
	public static int [] findIndexforSum(int [] listOfNumbers, int target) {
		 HashMap<Integer,Integer> numberWithIndex = new HashMap<>();
		 int [] result = new int [2];
		
		for (int i=0;i<listOfNumbers.length;i++) {
			if(numberWithIndex.containsKey(target-listOfNumbers[i])) {
				result[0]=i;
				result[1]=numberWithIndex.get(target-listOfNumbers[i]);
				break;
				
			}else {
				numberWithIndex.put(listOfNumbers[i],i);
			}
		}
		
		
		
		return result;
		
	}
	
	
	
	public static int [] findIndexSum(int [] nums, int target) {
		
		int [] result = new int [2];
		
		int low =0 , high=nums.length-1;
		
		Arrays.sort(nums);
		
		while(high>low) {
			
			if(nums[low]+nums[high]==target) {
				
				result[0]=low;
				result[1]=high;
				
				break;
			}else if(target> nums[low]+nums[high]) low++;
			else high--;
			
			
			
		}
		
		
		return result;
		
		
	}
	
	public static void main( String args[]) {
		
		int [] nums= {2,7,11,15};
		int target=10;
		int result [] = new int [2];
		
		//result=findIndexforSum(nums, target);
		
		result=findIndexSum(nums,target);
			
			System.out.println("first index"+result[0]+"Second Index"+ result[1] );
		
		
		
		
	}

}
