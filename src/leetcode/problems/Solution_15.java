/**
 * 
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author siddgarg
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.
 *
 */
public class Solution_15 {
	
	
	
	
	
	 public List<List<Integer>> findTriplets( int [] nums){
	        
	        
	        // since java 1.7 
	    List<List<Integer>> finalResult = new ArrayList<>();
	        
	        // first sort the array so that it is better to attach the problem
	        
	        
	        // we use the fucntion sort within class "Arrays" to sort the arrays
	        
	       Arrays.sort(nums);
	        
	        for(int i=0;i<nums.length-2;i++){
	            
	            int tempSum=0,low=0,high=0;
	            
	            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
	                
	                tempSum=0-(nums[i]);
	                low= i+1;
	                high= nums.length-1;
	                
	                while(high>low){
	                    
	                    if(nums[low]+nums[high]==tempSum){
	                   
	                    	
	                  finalResult.add(Arrays.asList(nums[i],nums[low],nums[high]));
	                    
	                    
	                    while(low<high && nums[low]==nums[low+1])low++;
	                    while(low<high && nums[high]==nums[high-1]) high--;
	                   low++;
	                   high--;
	                }
	            else if(tempSum>nums[low]+nums[high]) low++;
	                else high--;
	            }
	          }
	        }
	        
	        return finalResult;
	        
	    }
	    
	
	
	public Set<ArrayList<Integer>> findTriplets1( Integer[] nums){
		
		
		// no duplicates for HashSet
		Set<ArrayList<Integer>> finalResultSet= new HashSet<ArrayList<Integer>>();
		
		// "Integer" and not used "int" type data Array and then converted to a List and then to a set
		
		Integer [] testnums= new Integer[] {1,2,3,4};
		
		List<Integer> tempNums = Arrays.asList(testnums);
		
		Set<Integer> testnumsSet = new HashSet<Integer>(tempNums);
		
		
		
		// ArrayList
		List<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();
		
		
		// check boundary case 
		
		if(nums.length<3) {
			return finalResultSet;
		}
		
		
		findTriplets(nums,finalResultSet, new ArrayList<Integer>(),0);
		
		return finalResultSet;
		
	}

	private void findTriplets(Integer [] nums, Set<ArrayList<Integer>> finalResultSet, ArrayList<Integer> arrayList, int start) {
		// TODO Auto-generated method stub
		
		
		String [] testData = new String [] {"testValue"};
		
		Integer[] testIntData = new Integer[] {1,2,3};
		
		
		
		// String data
	    Set<String> JP_TIME_ZONES = new HashSet<String>(Arrays.asList(testData));

		
	    // Base is Integer data
		Set<Integer> tempSetList = new HashSet<Integer>(Arrays.asList(testIntData));
		
		
		
		Set tempSetListAgain = new HashSet<>(Arrays.asList(nums));
		
		
		Iterator<Integer> it = tempSetListAgain.iterator();
		
		while(it.hasNext()) {
			System.out.println("data in array"+ it.next() );
		}
		
		
		for(Integer testData1:tempSetList) {
			
		}
		
		for (int i=0;i<nums.length-1;i++) {
			
			if(tempSetListAgain.contains(-(nums[i]+nums[i+1]))) {
				
				List<Integer> tempResultList= new ArrayList<>();
				
				tempResultList.add(nums[i]);
				tempResultList.add(nums[i+1]);
				tempResultList.add(-(nums[i]+nums[i+1]));
				
				// have to cast the ArrayList and send the new object
				
				finalResultSet.add(new ArrayList<>(tempResultList));
			}
				
			
			
			
		}
		
	}
	
	
	

}
