/**
 * 
 */
package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siddgarg
 * 
 * Given a string, find the length of the longest substring without repeating characters.


 *
 */
public class Solution_problem_3 {
	
	int maxLength=0;
	
	int length=0;
	
	int startIndex=1;
	
	Map<Character,Number> charCount= new HashMap<>();
	
	public int findLenghtOfLongestSubstring(String inputData) {
		
		
		for(int j=0;j<inputData.length();j++) {
	
		
		for (int i=j;i<inputData.length();i++) {
			
			if(charCount.containsKey(inputData.charAt(i))) {
				
				charCount.clear();
				
				
				startIndex=1;
				
				maxLength= Math.max(maxLength,length);
				
			}else {
				
				charCount.put(inputData.charAt(i), startIndex);
				length=startIndex;
				startIndex=startIndex+1;
				
			}
			
			
			
			
		}
		
		
		
		
	}
		return maxLength;
	}

}
