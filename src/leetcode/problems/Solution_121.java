/**
 * 
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddgarg
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 */
public class Solution_121 {
	
	
	
	
	public void findMAxprofitMultipleTrans(int [] nums) {
		
		int start=0;
		
		int end=1;
		
		 List<Integer> buySellRecord = new ArrayList<>();
		
		while(start<nums.length-1) {
			
			if(nums[end]>nums[start]) {
				
				buySellRecord.add(nums[end]-nums[start]);
				
				start=end+1;
				end=start+1;
			}else {
				start++;
				end++;
			}
			
			
		}
		
		
		for(int temp :buySellRecord) {
			
			System.out.println(" the buy and sell margin "+ temp);
		}
	}
	
	
	
	
	// only if 1 transactio is allowed
	
	public int findMaxProfit(int nums[]) {
		
		
		int maxProfit = 0;
		
		
		int buyValue=nums[0];
		
	
		
		
		for(int i=0;i<nums.length-1;i++) {
			
	// finding max difference between two elements 			
						
						if(maxProfit<nums[i]-buyValue) {
							
							maxProfit=nums[i]-buyValue;
							
						}
						
						
				
					// replace the min only when you find another min value 
					if(nums[i]<buyValue) {
						
						buyValue=nums[i];
					}
					
		
		}
		
		
		return maxProfit;
	}

}
