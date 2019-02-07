/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 *
 *
 *Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.

Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
 */
public class Solution_Find_Missing_Alphabets {
	
	public static void findMissingCharacters(String inputString) {
		
		int [] hashLetters = new int [26];
		
		for(int i=0;i<inputString.length();i++) {
			
			// compare characters 
			
			if(inputString.charAt(i)>='a' && inputString.charAt(i)<='z') {
				
				hashLetters[inputString.charAt(i)-'a']= 1;
				
			}
			
		}
		
	   for(int j=0;j<26;j++) {
		   
		   if(hashLetters[j]!=1) {
			   
			   
			   // cast characters from integers in java 
			   
			   System.out.println("The missing letters are" + (char)(j+'a'));
			   
		   }
	   }
		
	}
	
	
	public static void main(String [] args) {
		
		
		findMissingCharacters("siddharthgarg");
		
	}

}
