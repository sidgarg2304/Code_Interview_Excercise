/**
 * 
 */
package leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author siddgarg
 * 
 * Given an input string, reverse the string word by word.

Example:  

Input: "the sky is blue",
Output: "blue is sky the".
Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.

Follow up: For C programmers, try to solve it in-place in O(1) space.

 *
 */
public class Solution_151 {
	
	StringBuilder reversedString= new StringBuilder();
	
	Stack outputStack = new Stack();

	public String reverseWord( String input) {
		
		if(input.isEmpty()) {
			return null;
		}
		
		StringBuilder newInput= new StringBuilder();
		newInput.append(input).append(" ");
		
		String finalInput= newInput.toString();
		
		int inputLength=finalInput.length();
		
		
		
		Queue words = new LinkedList();
		
		for(int i=0;i<inputLength;i++) {
			
			if(finalInput.charAt(i)!=' ') {
				
				words.add(finalInput.charAt(i));
			}else {
				
				StringBuilder str= new StringBuilder();
				for(Object s:words) {
					
					//String element = (String) s;
					if(s!=" ") {
					str.append(s);
					}
				
				}
				
				words= new LinkedList();
				
				outputStack.add(str.toString());
				
			}
		}
		
		
		
		while(!outputStack.isEmpty()) {
			reversedString.append(outputStack.pop()).append(" ");
		}
		
//		for(Object re:outputStack) {
//			String fout= (String) re;
//			reversedString.append(fout).append(" ");
//		}
		
		return reversedString.toString().trim();
		
	}
}
