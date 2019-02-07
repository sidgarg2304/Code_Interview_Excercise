/**
 * 
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * @author siddgarg
 * 
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array. 
 * The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
 *
 */
public class Solution_658 {
	
	
	int mid=0;
	
	
	// using the binary search to first find the index of the main element and then find the close numbers to it 
	
	public void findNearestKUsingBinary(int [] nums,int k,int x) {
		
		Integer [] finalResult = new Integer[k];
		
		int j=0;
		
		
		// sorting the array for binary search in case it is altready not sorted 
		Arrays.sort(nums);
		
		
		
		// works only for sorted array
		int index=findXUsingBinary(nums, x, nums.length,0);
		
		int left=index-1;
		int right= index+1;
		
		System.out.println("searched numner"+ nums[index]);
		
		while(j<k) {
			
			if(left>=0&&right<=nums.length) {
				
				if(Math.abs(x-nums[left])<Math.abs(x-nums[right])) {
					finalResult[j]=nums[left];
					j++;
					left--;
				}else if(Math.abs(x-nums[left])>Math.abs(x-nums[right])){
					
					finalResult[j]=nums[right];
					j++;
					right++;
					
				}else if(Math.abs(x-nums[left])==Math.abs(x-nums[right])) {
					finalResult[j]=nums[left];
					j++;
					left--;
				}
				
			}else if(left>=0 && right>nums.length) {
				
				finalResult[j]=nums[left];
				j++;
				left--;
				
			}else if(left<0 && right<=nums.length) {
				
				finalResult[j]=nums[right];
				j++;
				right++;
				
			}
			
			
		}
		
		
		for(int temp:finalResult) {
			
			System.out.println(" the final resut " + temp);
			
		}
		
		
		
		Arrays.asList(finalResult);
		
            for(int temp:finalResult) {
			
			System.out.println(" the final resut after list" + temp);
			
		}
		
		
		
	}
	
	
	
	
	// this works only for the sorted array
	private int findXUsingBinary(int [] input, int x,int high,int low) {
		
		if(low>high) {
			return mid;
		}
		
		mid=low+((high-low)/2);
		
		if(input[mid]==x) {
			return mid;
		}
		
		if(input[mid]<x) {
			return findXUsingBinary(input, x,high,mid+1) ;
		}else {
			return findXUsingBinary(input, x,mid-1,low) ;
		}
		
		
		// TODO Auto-generated method stub

	}



	public void findNearestK(int [] nums,int k,int x) {
		
		Map<Integer,Integer> sd= new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]!=x) {
				
				//Storing the difference with array index as key 
				sd.put(i, Math.abs(x-nums[i]));
			}
		}
		
		List<Integer> diffeList= new ArrayList<>(sd.values());
		
		List<Integer> diffeListkey= new ArrayList<>(sd.keySet());
		
		Collections.sort(diffeList);
		
		for(Integer temp:diffeListkey) {
			System.out.println("the difference array key " + temp);
		}
		
		Integer [] finalResult = new Integer[k];
		int j=0;
		
		for(Entry<Integer,Integer> et: sd.entrySet()) {
			
			if(j<k-1) {
				
				int value=diffeList.get(j);
				
				System.out.println("the value in list" + value);
				if (Objects.equals(value, et.getValue())) {
					finalResult[j]=nums[et.getKey()];
		           j++;
		        }
			}
			
		}
		
		for(int a:finalResult) {
			System.out.println(" final closet k elements" + a);
		}
		
		
	}

}
