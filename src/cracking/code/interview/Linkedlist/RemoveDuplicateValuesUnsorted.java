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
public class RemoveDuplicateValuesUnsorted {
	
	 LinkNode head;
	 LinkNode head2;
	 LinkNode head3;
	
	// add value to the end of linkedlist
	public void addValuestoLinkedList(int data) {
		
		if(head==null) {
			head= new LinkNode(data);
		}else {
			LinkNode current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new LinkNode(data);
		}
		
	}
	
public void addValuestoLinkedList2(int data) {
		
		if(head2==null) {
			head2= new LinkNode(data);
		}else {
			LinkNode current=head2;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new LinkNode(data);
		}
		
	}


public void addValuestoLinkedList3(int data) {
	
	if(head3==null) {
		head3= new LinkNode(data);
	}else {
		LinkNode current=head3;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new LinkNode(data);
	}
	
}
	
	public void displayLinkedList() {
		if(head==null) {
			return;
		}else {
			LinkNode current=head;
			while(current!=null) {
				System.out.println("Value in linkedList"+ current.data);
				current=current.next;
			}
		}
	}
	
	
	public void displayLinkedList2() {
		if(head2==null) {
			return;
		}else {
			LinkNode current=head2;
			while(current!=null) {
				System.out.println("Value in linkedList"+ current.data);
				current=current.next;
			}
		}
	}
	
	
	public void displayLinkedList3() {
		if(head3==null) {
			return;
		}else {
			LinkNode current=head3;
			while(current!=null) {
				System.out.println("Value in linkedList"+ current.data);
				current=current.next;
			}
		}
	}
	
	// delete a specific node with certain value 
	public void deleteRandomNode(int dataToDelete) {
		if(head==null) {
			return;
		}else {
			LinkNode current=head;
			LinkNode previous = null;
			while(current!=null) {
				System.out.println("Inside delete current value"+current.data);
				if(current.data!=dataToDelete) {
				previous=current;
				}else {
					previous.next=current.next;
					
				}
				current=current.next;
			}
			
			
		}
	}
	
	
	// delete the duplicate node from unsorted the linklist using datastructure
	// need to find a solution using without data structure 
		public void findDuplicates() {
			Map<Integer,Integer> storelistvalue = new HashMap<>();
			int i=0;
			LinkNode current=head;
			LinkNode prev=null;
			while(current!=null) {
				if(!storelistvalue.containsValue(current.data)) {
					storelistvalue.put(i, current.data);
					i++;
					prev=current;
				}else {
					System.out.println("Duplicate value in list"+ current.data);
					prev.next=current.next;
				}
				current=current.next;
				
			}
			
			
		}
		
// find kth to the last element 
		
		
		public void kTotheLastelement(int k) {
			LinkNode current=head;
			LinkNode iterate=head;
			int i=0;
			while(current!=null) {
				current=current.next;
				i++;
			}
			System.out.println("Lenght od linkedlist"+ i);
			// kth to the last element
			int n=i-k;
			while(n>1) {
				iterate=iterate.next;
				n--;
			}
			System.out.println("Kth to the last element"+iterate.data);
			
			
		}
		
		// delete a node in a linkedlist given access to only that node and not the header
		
		// copy the valeu of next node to current and delete the next node to maintain the whole list
		//current.data=current.next.data
		//current.next=current.next.next
		
		public void ListPartition(int dValue) {
			LinkNode current=head;
			LinkNode iterate=null;
			while (current!=null) {
				// any value equal or greater than number should be replaced by smaller number 
				if(current.data>=dValue) {
					iterate=current.next;
					while(iterate!=null) {
					if(iterate.data<dValue) {
						int cachce;
						cachce=iterate.data;
						iterate.data=current.data;
						current.data=cachce;
					}else {
						iterate=iterate.next;
					}
					
				}
				}
				current=current.next;
				
			}
			
		}
		
		// add two linkedList values
		// how handle value greater than 9 in last digit 
		// don't do this at the last value that is added so adding a condition for that 
		public void addTwoLinkedListValues() {
			
			LinkNode current=head;
			LinkNode current2=head2;
			int carry=0;
			while(current!=null) {
				int sum=current.data+current2.data+carry;
				carry=0;
				if(current.next!=null) {
				if(sum>=10) {
					sum=sum-10;
					carry=1;
				}
				}
				addValuestoLinkedList3(sum);
				current=current.next;
				current2=current2.next;
				
			}
			
			
			
			
		}
		

}
