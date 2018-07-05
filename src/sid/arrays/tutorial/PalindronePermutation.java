/**
 * 
 */
package sid.arrays.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author siddgarg
 *
 */
public class PalindronePermutation {
	
	public void palindronepermutatio() {
		
		
		try{
			
	    boolean condition=false;
		int countapla=0;
		String text="textx";
		
		Map<Character,Integer> count= new HashMap<>();
		
		int stringLenght=text.length();
		
		for(int i=0;i<stringLenght;i++) {
			
			if(count.containsKey(text.charAt(i))) {
		
			
			count.put(text.charAt(i),count.get(text.charAt(i)+1));
			}else {
				count.put(text.charAt(i), 1);
			}
		}
		
		if(stringLenght%2==0) {
			
			for(Entry<Character,Integer> e:count.entrySet()) {
				if(e.getValue()%2==0) {
					condition=true;
				}
				
			}
			
		}else {
			
			for(Entry<Character,Integer> e:count.entrySet()) {
				if(e.getValue()==1) {
					countapla++;
				}
			
		}
		
		
	}
	}catch(Exception e) {
		
	}
	}

}
