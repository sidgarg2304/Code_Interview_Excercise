/**
 * 
 */
package leetcode.problems;

import java.util.HashMap;

/**
 * @author siddgarg
 *
 *
 * 13. Roman to Integer
 *
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 

 */
public class Solution_13 {
	
	public static void convertRomanToInteger(String romanInput) {
		
		int result = 0;
		
		HashMap<Character,Integer> romanmap = new HashMap<>();
		romanmap.put('I',1);
		romanmap.put('V',5);
		romanmap.put('X',10);
		romanmap.put('L',50);
		romanmap.put('C',100);
		romanmap.put('D',500);
		romanmap.put('M',1000);
		
		for(int i=0;i< romanInput.length();i++) {
			
			System.out.println("Individual character"+ romanInput.charAt(i) );
			
			if(i>0 && romanmap.get(romanInput.charAt(i))> romanmap.get(romanInput.charAt(i-1))) {
				
				result+=romanmap.get(romanInput.charAt(i))-2*romanmap.get(romanInput.charAt(i-1));
				
			}else {
				
				result+=romanmap.get(romanInput.charAt(i));
			}
		}
		
		System.out.println("Result--"+ result);
		
		
		
		
	}
	
	public static void main (String [] args) {
		
		convertRomanToInteger("MMMCDL");
		
	}

}
