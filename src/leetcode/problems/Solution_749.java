/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 
 
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, 
and you can either start from the step with index 0, or the step with index 1.


 *
 */
public class Solution_749 {
	
	
	
	public int findMinCost(int [] input) {
		
		if(input==null) {
			return 0;
		}
		
		if(input.length==1) {
			return input[0];
		}
		
		if(input.length==2) {
			return Math.min(input[0], input[1]);
		}
		
		int [] cost = new int [input.length];
		
		int finalCostat0=findMinValue(input,0,cost);
		
		int finalCostat1=findMinValue(input,1,cost);

		return Math.min(finalCostat0, finalCostat1);
	}

	private int findMinValue(int[] input, int i, int[] cost) {
		// TODO Auto-generated method stub
		
		
		 if(i == input.length-1 || i == input.length-2)
	            return input[i];
		 
	        if(cost[i] > 0) return cost[i];
	        
	        int cost1 = findMinValue(input, i+1, cost) + input[i];
	        int cost2 = findMinValue(input, i+2, cost) + input[i];
	       
	        cost[i] = Math.min(cost1, cost2);
	        
	        return Math.min(cost1, cost2);
		
	}

}
