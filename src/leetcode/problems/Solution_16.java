/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 *
 *
 * 16. 3Sum Closest
 *
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 *
 *
 */
public class Solution_16 {
	
	public static void findClosestSum(int [] inputIntegers, int target) {
		
		int minDifference = 0;
		int result=0;
		
		// should the numbers be in sequence ?? 
		
		for (int i=0;i< inputIntegers.length-3;i++) {
			
			for(int j=i+3;j<inputIntegers.length;j++) {
				
				int sum= inputIntegers[i]+inputIntegers[i+1]+inputIntegers[i+2];
				
				if(minDifference<(sum-target)) {
					
					minDifference=sum-target;
					result=sum;
				}
				
			}
			
		}
		
		System.out.println("minDifference" + minDifference+" final sum"+ result);
		
		
		
	}
	
	public static void main(String [] args) {
		
		int [] inputArray= {-1,2,1,-4};
		int target=1;
		findClosestSum(inputArray,target);
		
	}

}
