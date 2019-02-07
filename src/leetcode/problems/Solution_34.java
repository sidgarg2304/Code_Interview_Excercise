/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].
 * 
 *
 */
public class Solution_34 {
	
	int result[] = {-1,-1};
	
	int finalResult[] = {-1,-1};
	
	// main function 
	
	public int [] findIndex( int [] input, int target) {
		
		// always pick boundary cases first. then look for main use case
		
	if(input==null|| input.length==0) {
		return result;
	}
	
	if(input.length<2) {
		if(input[0]==target) {
			result[0]=0;
			result[1]=0;
			
			return result;
			
		}
		
	}
	
	
	result=useBinarySearch(input,target,0,input.length-1);
	
	if(result[0]!=-1) {
		
		int firstIndex=result[0];
		
		int lastIndex=result[0];
		
		while(firstIndex>0) {
			
			if(input[firstIndex-1]==target) {
				firstIndex--;
			}else {
				break;
			}
			
		}
		
     while(lastIndex<input.length) {
			
			if(input[lastIndex+1]==target) {
				lastIndex++;
			}else {
				break;
			}
			
		}
		
		
		
		if(firstIndex>=0)
		finalResult[0]=firstIndex;
		
		if(lastIndex<=input.length) {
			finalResult[1]=lastIndex;
		}
		
		
	}
	
	return finalResult;
		
	}
	
	
	
	public int [] useBinarySearch(int [] inputArr, int target,int low ,int high) {
		
		if(high<low) {
			return result;
		}
		
		int mid= low + ((high - low) / 2);
		
		if(inputArr[mid]==target) {
			
			result[0]=mid;
			
//			for(int i=mid+1;i<inputArr.length;i++) {
//				
//			}
			
			return result;
		}
		
		if(inputArr[mid]>target) {
			
			return useBinarySearch(inputArr,target,low,mid-1);
			
		}else {
			
			return useBinarySearch(inputArr,target,mid+1,inputArr.length-1);
			
		}
		
		

	}
	
	

}
