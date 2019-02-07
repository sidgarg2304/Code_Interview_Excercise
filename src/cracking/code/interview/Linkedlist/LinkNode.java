/**
 * 
 */
package cracking.code.interview.Linkedlist;

/**
 * @author siddgarg
 *
 */
public class LinkNode {
	int data;
   

       LinkNode next;
	
	
	// constructor with no return type
	public LinkNode(int data) {
		this.data=data;
		next=null;
		
	}
	
	// public getter and setter functions so that other classes can access the private variables
	
	 public int getData() {
			return data;
		}


		public void setData(int data) {
			this.data = data;
		}


		public LinkNode getNext() {
			return next;
		}


		public void setNext(LinkNode next) {
			this.next = next;
		}


}
