/**
 * 
 */
package cracking.code.interview.Linkedlist;

/**
 * @author siddgarg
 *
 */
public class QueueusingListlist {
	
	LinkNode head;
	
	public void createQueue(int data) {
		
		if(head==null) {
			head=new LinkNode(data);
		}else {
			LinkNode current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new LinkNode(data);
		}
		
	}
	
	
	public void deQueue() {
		if(head==null) {
			return;
		}else {
			LinkNode current=head;
			while(current.next.next!=null) {
				current=current.next;
			}
			current.next=null;
		}
	}
	
	
	public void printQueue() {
		if(head==null) {
			return;
		}else {
			LinkNode current=head;
			while(current!=null) {
				System.out.print("Queue Elements--"+ current.data);
				current=current.next;
				
			}
			
		}
	}

}
