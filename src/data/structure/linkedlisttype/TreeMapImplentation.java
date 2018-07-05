/**
 * 
 */
package data.structure.linkedlisttype;


import java.util.*;

/**
 * @author siddgarg
 *
 */
public class TreeMapImplentation {
	
	public void addTreeValue() {
		
  try {
  TreeMap<Integer,String> map1= new TreeMap<Integer,String>();
   map1.put(1,"test1");
   map1.put(2,"test2");
   
   Collection c= map1.values();
   
   Iterator itr= c.iterator();
   
   while (itr.hasNext()) {
	   System.out.println(itr.next()+"value");
   }
   
	
	}catch(Exception e) {
		
		System.out.println("Error message" + e);
	}
		
	}

}
