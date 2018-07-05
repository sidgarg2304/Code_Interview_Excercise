/**
 * 
 */
package sid.tutorial.javalistexmaple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author siddgarg
 *
 */
public class ShuffleList {
	
	public static void main(String [] args) {
		
		List<String> randomvalues= new ArrayList<>();
		List<String> linkValue= new LinkedList<>();
		
		int i=0;
		int j=0;
		
		System.out.println("string value"+ args[0]);
		for(String a:args) {
			
			i++;
			randomvalues.add(a);
			
			System.out.println(" random list 1"+ randomvalues+"value of i"+ i);
			
		}
		
		randomvalues.add("sid");
		
		Iterator<String> it= randomvalues.iterator();
		
		System.out.println("size of list"+randomvalues.size());
		
		while(it.hasNext()) {
			
			j++;
			System.out.println("string value"+ args);
			//System.out.println(" random list 2"+ it.next()+"value of j"+ j);
			
			// without it.next , the it object doesn't look for next item and keep on looping .. never ending loop. have to do it.next() .. 
			
			System.out.println(" random list 2"+ it.next()+"value of j"+ j);
		}
		
		
		Collections.shuffle(randomvalues);
		
		Collections.sort(randomvalues);
		System.out.println(" random list 3"+ randomvalues);
		
	}

}
