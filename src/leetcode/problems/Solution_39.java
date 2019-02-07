/**
 * 
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddgarg
 * 
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.

Input: candidates = [2,3,5], target = 8,


A solution set is:

// ArrayList to hold Arrays
 * 
 * 
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
    	if(target > 0){
    		for(int i = start; i < candidates.length && target >= candidates[i]; i++){
    			cur.add(candidates[i]);
    			getResult(result, cur, candidates, target - candidates[i], i);
    			cur.remove(cur.size() - 1);
    		}//for
    	}//if
    	else if(target == 0 ){
    		result.add(new ArrayList<Integer>(cur));
    	}//else if
    }
 *
 */
public class Solution_39 {
	
	
	
	
	
	public List<List<Integer>> findSumCombination(int [] input, int target){
		
		
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		
		
		getFinalResult(input,target, new ArrayList<>(), finalResult, 0);
		
		
		
		return finalResult;
		
	}
	
	
	
	
	
	// the variable finalResult doesn't have to be returned because Java is "pass by Value" so the value changes in variable remain intact across the code
	

	private void getFinalResult(int[] input, int target, List<Integer> arrayList, List<List<Integer>> finalResult, int start) {
		// TODO Auto-generated method stub
		
		if(target>0) {
			
			for (int i=start;i< input.length && target>= input[i];i++) {
				
				arrayList.add(input[i]);
				
				getFinalResult(input,target-input[i],arrayList,finalResult,i);
				
				
				arrayList.remove(arrayList.size()-1);
				
				
			}
			
			
		}else if(target==0) {
			finalResult.add(new ArrayList<Integer>(arrayList) );
		}
		
		
		
	}






	public List<int []> findCombination(int [] input, int target){
		
		List<int []> numComb= new ArrayList<>();
		
		// if we can divide by that number then we can use it for sum
		
		if(input.length<1) {
			
			return null;
		}
		
		for(int i=0;i<input.length-1;i++) {
			
			
			// base condition if number is multiple of target
			
			if(target%input[i]==0) {
				
				int multiple= (target/input[i]);
				
				int [] temp = new int[multiple];
				
				for(int j=0;j<multiple;j++) {
					temp[j]=input[i];
				}
				
				numComb.add(temp);
				
			}
			
			
			int k=i+1;
			
			while(k<input.length-1) {
				
				
				
			}
			
			
			
		}
		
		
		return numComb;
		
		
	}
	
	
}
