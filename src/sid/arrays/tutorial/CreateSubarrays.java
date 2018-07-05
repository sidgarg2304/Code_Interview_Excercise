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
public class CreateSubarrays {

	List<Integer> listArrays= new ArrayList<>();
	
	public void CreateSubarrayList(List<Integer> test) {
		
		try {
			
			for(int i:test) {
				System.out.println("From test "+i);
			}
	
	listArrays.add(1);
	listArrays.add(2);
	listArrays.add(3);
	listArrays.add(4);
	listArrays.add(5);
	listArrays.add(6);
	
	
	for(int i:listArrays) {
		System.out.println("List values"+i);
	}
	
	
	
	for (int i=0;i<listArrays.size();i++) {
		
		for(int j=i;j<listArrays.size();j++) {
			
			for(int k=i;k<j;k++) {
			
			System.out.print("SubArray"+ listArrays.get(k)+"  ");
			}
			
			System.out.println();
		}
		
	}
	
	
	
	}catch(Exception e) {
		
		System.out.println("Exception"+e);
		
	}
		
		
	
}
	
}
