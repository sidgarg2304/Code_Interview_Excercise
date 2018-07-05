/**
 * 
 */
package cracking.code.interview.Linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siddgarg
 *
 */
public class ListListnode {
	LinkNode head;
	// to add the value at the end of linklist
	public void createListappend(int data) {
		
		System.out.println("Inside the create code");
		if(head==null) {
			
			System.out.println("for head data sent from code"+ data);
			head= new LinkNode(data);
			return;
		}
		
		// never reset the head after creation. Always map it to current and iterate over it 
		
		LinkNode current=head;
		
		
		System.out.println("data sent from code"+ data);
		
		// never reset the head after creation. Always map it to current and iterate over it 
		while (current.next!=null) {
			
			current=current.next;
			
		}
		
		System.out.println("data sent from code"+ data);
		
		current.next= new LinkNode(data);
		
	}
	
	// delete the duplicate node from the linklist
	public void findDuplicates() {
		Map<Integer,Integer> storelistvalue = new HashMap<>();
		int i=0;
		LinkNode current=head;
		while(current.next!=null) {
			if(!storelistvalue.containsValue(current.next.data)) {
				storelistvalue.put(i, current.data);
				i++;
				current=current.next;
			}else {
				System.out.println("Duplicate value in list"+ current.data);
				current.next=current.next.next;
			}
			
		}
		
		
	}
	
	
	public void printList() {
		System.out.println("Inside the print code");
		LinkNode current=head;
		// while (current!null) will leave you at current node for operations
		// while(current.next) will help you check the next node and do operations on current node
		while(current!=null) {
			System.out.println("value in the list"+ current.data);
			current=current.next;
		}
	}
	
	// to find the kth to the last element
	public void displaykElement(int k) {
		LinkNode current=head;
		int i=0;
//		while(k>0) {
//			current=current.next;
//			k--;
//		}
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
			i++;
		}
		int diff=i-k;
		
		
		
	}
	
	// k=n-1// assuming you know the size of a linkedlisy that ou don't know stupid so this is a wrong solution
	public void deletekthElement(int k) {
		
		if(head==null) {
			return;
		}else{
			LinkNode current=head;
			for(int i=1;i<k-1;i++) {
				current=current.next;
			}
			current.next=current.next.next;
			
		}
		
	}
	
	
	public void deletesecounfLastelement() {
		
		LinkNode previous=head;
		LinkNode current=head.next;
		
		if(head==null) {
			return;
			
		}else {
			while(current.next.next!=null) {
				previous=current;
				current=current.next;
			}
			previous.next=current.next;
			
		}
	}
	
	public void deleteAlternateNode() {
		if(head==null) {
			return;
		}else {
			
			LinkNode current=head;
			while(current!=null) {
				current.next=current.next.next;
				current=current.next.next;
			}
			
			
		}
	}

}
