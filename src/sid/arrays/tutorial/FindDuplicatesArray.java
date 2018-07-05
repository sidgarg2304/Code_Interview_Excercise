/**
 * 
 */
package sid.arrays.tutorial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author siddgarg
 *
 */
public class FindDuplicatesArray {
	
	public void findDuplicate(List<Integer> arrayList) {
		
		Map<Integer,Integer> countMap = new HashMap<>();
		int j=0;
		for(int i:arrayList) {
			if(countMap.containsValue(i)) {
				System.out.println("Interger repeated"+ i);
			}else {
				countMap.put(j, i);
				j++;
			}
			
			
				
				
			}
		
		for(int k:countMap.values()) {
			
			System.out.println("Hashmap values"+k);
		}
		
	}

}
