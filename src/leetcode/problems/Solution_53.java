/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 */
public class Solution_53 {
	
	
	
	public void findMaxSubArray(int [] input) {
		
		int maxSum=input[0];
		int tempSum=input[0];
		
		for(int i=1;i<input.length;i++) {
			
			tempSum=tempSum+input[i]>input[i]? tempSum+input[i]:input[i];
			
			
			if(tempSum>maxSum) {
				maxSum=tempSum;
			}
		}
		
		System.out.println(" the max Sum is "+ maxSum);
		
		
	}
	
	
	
	// dynamic programming - using the result from previous iteration to calcuate the next values 
	
public int maxSubArray(int[] nums) {
        
        // if(nums.length<2){
        //     return nums;
        // }
        
        int maxSum=nums[0];
        int curSum=0;
        
        for(int i=0;i<=nums.length-1;i++){
            
            curSum=curSum+nums[i];
            
            if(maxSum<curSum){
                maxSum=curSum;
            }
            
            if(curSum<0){
                
                curSum=0;
            }
            
            
            
        }
        
        return maxSum;
        
    }

}
