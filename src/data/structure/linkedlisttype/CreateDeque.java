/**
 * 
 */
package data.structure.linkedlisttype;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author siddgarg
 *
 */
public class CreateDeque {
	
	public void createDequesList() {
		Deque<String> dequlist= new LinkedList<>();
		
		dequlist.offerFirst("test1");
		dequlist.offerFirst("test2");
		
		for(String s:dequlist) {
			System.out.println("List value"+ s);
		}
		
	}

}
