/**
 * 
 */
package sid.arrays.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author siddgarg
 *
 */
public class RemoveDuplicateString {
	
	public void removeDuplicateString(String text) {
		
		List<Character> textList= new ArrayList<>();
		Map<Integer,Character> mapcharacter= new HashMap<>();
		int i=0;
		char[] finalcharcater;
		char[] textarray=text.toCharArray();
		
		
		for (char s:textarray) {
			if(textList.contains(s)){
			//if(mapcharacter.containsValue(s)) {
				System.out.println("Duplicate Value--" + s);
			}else {
				mapcharacter.put(i, s);
				textList.add(s);
				i++;
			}
			
			
			
		}
		
		String finalString=textList.toString().replaceAll(",", "");
		
		System.out.println("Final String"+finalString);
		
		for (char w:mapcharacter.values()) {
			System.out.println("Character HashMap"+ w);
		}
		
		for (char t:textList) {
			System.out.println("String characters--"+t);
		}
		
		
		//textList=text.toCharArray()
		
	}

}
