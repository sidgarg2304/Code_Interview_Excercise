/**
 * 
 */
package sid.arrays.tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddgarg
 *
 */
public class FindTwoStringsPermutation {
	
	public void findtwoStringsPermutation(String str1,String str2) {
		try {
			Boolean test=false;
			
		char[] str1Char=str1.toCharArray();
		char[] str2Char=str2.toCharArray();
		List<Character> listOfCharstr2= new ArrayList<>();
		// convert stringto interger , it returns ASCII value
		int i=str1.charAt(0);
		System.out.println("ASCII String at index 0"+i);
		
		if(str1.length()==str2.length()) {
			for(char c:str1Char) {
				listOfCharstr2.add(c);
			}
			
			for(char c:str2Char) {
				
				if(listOfCharstr2.contains(c)) {
					test=true;
				}else
				{
					test=false;
				}
			}
	
	}else {
		
		System.out.println("Not a permutation");
	}
		
		System.out.println("Value of Boolean"+test);
		

}catch(Exception e){
	
}
		}
}
