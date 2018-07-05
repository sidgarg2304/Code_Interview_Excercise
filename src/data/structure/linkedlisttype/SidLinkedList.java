/**
 * 
 */
package data.structure.linkedlisttype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author siddgarg
 *
 */
import data.structure.linkedlisttype.NodeSid;
public class SidLinkedList {
	
	
	NodeSid head;
	
	public void append(int data) {
		
		if(head==null) {
			head =new NodeSid(data);
			return;
			
		}
		
		NodeSid current=head;
		
		while(current.next!=null) {
			
			current=current.next;
			
		}
		
		current.next= new NodeSid(data);
		
		
		
	}
	
	public void prepend(int data) {
		
		NodeSid newhead= new NodeSid(data);
		newhead.next=head;
		head=newhead;
		
	}
	
	public void deleteWithValue(int data) {
		
		NodeSid current= head;
		if(head==null) {
			return;
		}
		if(head.data==data) {
			head=head.next;
		}
		while(current.next!=null) {
			
			if (current.next.data==data) {
				current.next=current.next.next;
				return;
			}
			current=current.next;
			
		}
		
		
		
	}
	
	public void reverseLinkedList() {
		
		NodeSid previous =null;
		NodeSid nextList =null;
		NodeSid current=head;
		List<NodeSid> listArray= new ArrayList<NodeSid>();
		
		System.out.println("inside reverselist");
		
		while (current!=null) {
			
			System.out.println("inside first while loop");
			nextList=current.next;
			current.next=previous;
			previous=current;
			current=nextList;
		}
		
		NodeSid newhead= previous;
		
		head=newhead;
		
         while(newhead!=null) {
			
			System.out.println("Reversed List data"+ newhead.data);
			
			newhead=newhead.next;
			
         }
		
//		Iterator<NodeSid> itr= listArray.iterator();
//		
//		while(itr.hasNext())
//		{
//		System.out.println("ArrayList address"+ itr.next());
		
//		}
		
	}
	
	
	public void printListValue() {
		
		NodeSid current=head;
			
		while(current!=null) {
			
			System.out.println("List data"+ current.data);
			
			current=current.next;
			
			
		}
		
	}
	
	
	public void implementStackDeletefromFront() {
		// LIFO - Last in first out 
		
		System.out.println("Inside stack delet");
		
		head=head.next;
		
		NodeSid current=head;
		
		while(current!=null) {
			
			System.out.println("List data after removal stack"+ current.data);
			
			current=current.next;
		
		
	}
	
	

}
}

