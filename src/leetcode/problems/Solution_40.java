/**
 * 
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author siddgarg
 * 
 * 
 * 
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.


Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]


 *
 */
public class Solution_40 {
	
	
	public List<ArrayList<Integer>> findUniCombination(int [] nums, int target){
		
		List<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();
		
		Arrays.sort(nums);
		
		processInput(nums,target,0,finalResult, new ArrayList<Integer>());
		
		return finalResult;
	}
	
	

	private void processInput(int[] nums, int target, int start, List<ArrayList<Integer>> finalResult,
			ArrayList<Integer> arrayList) {
		
		
		// TODO Auto-generated method stub
		
		
		
			
			if(target>0) {
				
				for(int i=start;i<nums.length;i++) {
					
					if(i>start && nums[i]==nums[i-1]) continue;
				arrayList.add(nums[i]);
				processInput(nums,target-nums[i],i+1,finalResult,arrayList);
				
				arrayList.remove((arrayList).size()-1);
				
				}
				
			}else if(target==0) {
				
				finalResult.add(new ArrayList<>(arrayList));
				
			}
			
			
			
		}
		
		
		
		

	

}
